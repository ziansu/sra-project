private boolean validateUI() {
    java.util.Iterator it = reportHasmap.entrySet().iterator();
    while (it.hasNext()) {
        java.util.Map.Entry pair = ((java.util.Map.Entry) (it.next()));
        if (!(pair.getValue().equals("none"))) {
            return true;
        }
    } 
    showNormalDailog(activity.getResources().getString(R.string.youHaveNotReportedAnEntryText));
    return false;
}
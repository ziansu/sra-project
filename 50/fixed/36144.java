private void setCheckBoxAsChecked(boolean isCompleted) {
    try {
        chkDone.setSelected(isCompleted);
    } catch (java.lang.NullPointerException e) {
    }
}
private void updateDataSubId(android.os.AsyncResult ar) {
    java.lang.Integer subId = ((java.lang.Integer) (ar.result));
    int reqStatus = PhoneConstants.FAILURE;
    logd((((" updateDataSubId,  subId=" + subId) + " exception ") + (ar.exception)));
    if ((ar.exception) == null) {
        setDataSubId(subId);
        reqStatus = PhoneConstants.SUCCESS;
    }
    mScheduler.updateCurrentDds(null);
    broadcastDefaultDataSubIdChanged(reqStatus);
}
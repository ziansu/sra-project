public com.akexorcist.googledirection.request.DirectionRequest transitMode(java.lang.String transitMode) {
    java.lang.String oldTransitMode = param.getTransitMode();
    if ((oldTransitMode != null) && (!(oldTransitMode.isEmpty()))) {
        oldTransitMode += "|";
    }else {
        oldTransitMode = "";
    }
    oldTransitMode += transitMode;
    param.setTransitMode(oldTransitMode);
    return this;
}
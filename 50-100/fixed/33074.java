private java.lang.String getReasonString(java.util.List<in.bhargavrao.stackoverflow.natty.services.Reason> reasons) {
    java.lang.String retStr = "";
    for (in.bhargavrao.stackoverflow.natty.services.Reason reason : reasons) {
        if (((reason.getSubReason()) == null) || (reason.getSubReason().trim().equals("")))
            retStr += (reason.getReasonName()) + ";";
        else
            retStr += (((reason.getReasonName()) + " - ") + (reason.getSubReason())) + ";";
        
    }
    return retStr;
}
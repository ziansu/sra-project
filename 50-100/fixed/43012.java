public static java.lang.String getActivateLink(java.lang.String pid, java.lang.String filter, java.lang.String order, int pageNumber) {
    java.lang.String encodedPid = pid;
    try {
        encodedPid = java.net.URLEncoder.encode(pid, "UTF-8");
    } catch (java.io.UnsupportedEncodingException e) {
        org.wso2.carbon.bpel.ui.BpelUIUtil.log.error((("Error encoding the url " + pid) + e));
    }
    java.lang.String link = (("process_list.jsp?operation=activate&processID=" + encodedPid) + "&pageNumber=") + pageNumber;
    return link;
}
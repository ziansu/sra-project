public static java.util.List<com.aimluck.eip.webmail.WebMailFolderResultData> getMailFolderAll(com.aimluck.eip.cayenne.om.portlet.EipMMailAccount account) {
    java.util.List<com.aimluck.eip.cayenne.om.portlet.EipTMailFolder> folderList = com.aimluck.eip.mail.util.ALMailUtils.getEipTMailFolderAll(account);
    java.util.List<com.aimluck.eip.webmail.WebMailFolderResultData> list = new java.util.ArrayList<com.aimluck.eip.webmail.WebMailFolderResultData>();
    for (com.aimluck.eip.cayenne.om.portlet.EipTMailFolder folder : folderList) {
        com.aimluck.eip.webmail.WebMailFolderResultData data = new com.aimluck.eip.webmail.WebMailFolderResultData(folder);
        list.add(data);
    }
    return list;
}
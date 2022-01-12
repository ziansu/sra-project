private java.lang.String getUnsubscribeFooter(java.lang.String emailAddress, com.xpn.xwiki.doc.XWikiDocument blogDocument) throws com.xpn.xwiki.XWikiException {
    java.lang.String unsubscribeFooter = "";
    if (!("".equals(getUnsubscribeLink(blogDocument.getSpace(), emailAddress)))) {
        com.xpn.xwiki.web.XWikiMessageTool messageTool = getWebUtilsService().getMessageTool(getContext().getLanguage());
        unsubscribeFooter = messageTool.get("cel_newsletter_unsubscribe_footer", java.util.Arrays.asList(getUnsubscribeLink(blogDocument.getSpace(), emailAddress)));
    }
    return unsubscribeFooter;
}
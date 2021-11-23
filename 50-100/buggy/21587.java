private void getPlainText(java.lang.StringBuffer buffer, java.lang.Object node) {
    if (node instanceof org.htmlcleaner.ContentNode) {
        org.htmlcleaner.ContentNode contentNode = ((org.htmlcleaner.ContentNode) (node));
        buffer.append(contentNode.getContent());
    }else {
        org.htmlcleaner.TagNode tagNode = ((org.htmlcleaner.TagNode) (node));
        for (java.lang.Object child : tagNode.getChildren()) {
            getPlainText(buffer, child);
        }
    }
}
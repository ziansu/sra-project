private org.quicktionary.backend.TextNode generateNotFound(java.lang.String string) {
    org.quicktionary.backend.TextNode root;
    org.quicktionary.backend.TextNode paragraph;
    org.quicktionary.backend.TextNode header;
    org.quicktionary.backend.TextNode text;
    root = new org.quicktionary.backend.TextNode(org.quicktionary.backend.TextNode.ROOT_TYPE);
    header = root.appendChild(new org.quicktionary.backend.TextNode(org.quicktionary.backend.TextNode.HEADER_TYPE));
    paragraph = root.appendChild(new org.quicktionary.backend.TextNode(org.quicktionary.backend.TextNode.PARAGRAPH_TYPE));
    header.setContent("Sorry!");
    text = paragraph.appendChild(new org.quicktionary.backend.TextNode(org.quicktionary.backend.TextNode.PLAIN_TYPE));
    text.setContent((("We couldn't find the page for the word " + string) + "."));
    return root;
}
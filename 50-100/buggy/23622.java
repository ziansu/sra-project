private static java.lang.String analyzeContent(java.util.List<java.lang.String> content) throws java.lang.Exception {
    if ((content == null) || ((content.size()) == 0)) {
        return "";
    }
    com.fragmentime.markdownj.elements.Element root = new com.fragmentime.markdownj.elements.Element();
    for (java.lang.String item : content) {
        root.append(item);
    }
    com.fragmentime.markdownj.parser.Parser.getParser().analyzeContent(root);
    com.fragmentime.markdownj.parser.Parser.analyzeElementTree(root);
    return root.render();
}
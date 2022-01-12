public static java.util.List<com.youbenzi.mdtool.markdown.Block> analyze(java.lang.String content) {
    com.youbenzi.mdtool.markdown.filter.SyntaxFilter filter = new com.youbenzi.mdtool.markdown.filter.CodePartFilter(new com.youbenzi.mdtool.markdown.filter.CodeListFilter(new com.youbenzi.mdtool.markdown.filter.TablePartFilter(new com.youbenzi.mdtool.markdown.filter.HeaderOneLineFilter(new com.youbenzi.mdtool.markdown.filter.ListFilter(new com.youbenzi.mdtool.markdown.filter.HeaderNextLineFilter(null))))));
    java.util.List<com.youbenzi.mdtool.markdown.Block> blocks = filter.call(content);
    return blocks;
}
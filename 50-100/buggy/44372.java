protected void tokenizeBySpace(java.lang.String keyword, java.util.List<java.lang.String> tokens) {
    java.lang.String[] keywordTokens = com.liferay.portal.kernel.util.StringUtil.split(keyword, CharPool.SPACE);
    for (java.lang.String keywordToken : keywordTokens) {
        keyword = keywordToken.trim();
        if (!(keyword.isEmpty())) {
            tokens.add(keyword);
        }
    }
}
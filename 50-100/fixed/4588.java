public void finalize(java.io.PrintWriter writer) {
    for (java.lang.String s : relevantEntities) {
        java.lang.StringBuilder builder = new java.lang.StringBuilder();
        builder.append(s);
        builder.append(" ");
        java.lang.String wikiText = "";
        wikiText = getWikiText(s);
        builder.append(format(wikiText));
        if (!(wikiText.equalsIgnoreCase(""))) {
            writer.println(builder.toString());
        }
    }
}
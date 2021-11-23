public java.lang.String clean(java.lang.String verse) {
    return verse.replaceAll("<(\"[^\"]*\"|\'[^\']*\'|[^\'\">])*>", "").replaceAll("&nbsp;", " ").replaceFirst("^.*\n[0-9]+", "").replaceAll("\n", " ").replaceFirst("[0-9]+", "").replaceAll("\\[[a-z]]", "").replaceAll("[ ]{2,}", " ").trim();
}
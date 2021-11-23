public java.lang.String translation(java.lang.String word) {
    java.lang.StringBuilder sb = new java.lang.StringBuilder();
    java.util.Set<java.lang.String> set = home.rong.joker.itools.util.YoudaoTransUtil.translate(word);
    for (java.lang.String s : set)
        sb.append(s).append("\n");
    
    return sb.toString();
}
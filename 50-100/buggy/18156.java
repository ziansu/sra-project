public java.lang.String[] mixCuttingEnCh(java.lang.String content) {
    java.util.List<java.lang.String> list = new java.util.ArrayList<java.lang.String>();
    for (java.lang.String s : com.shenji.search.core.dic.CustomWordDic.costomEnChDic) {
        if (content.contains(s)) {
            list.add(s);
        }
    }
    return ((java.lang.String[]) (list.toArray(new java.lang.String[list.size()])));
}
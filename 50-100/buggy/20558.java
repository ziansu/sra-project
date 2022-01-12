public void moveHeadRight() {
    (rwHead)++;
    if ((rwHead) > ((content.length) - 1)) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        java.lang.String oldContent = new java.lang.String(content);
        sb.append(oldContent);
        sb.append("_");
        setContent(sb.toString());
        java.lang.System.out.println(sb.toString());
    }
    java.lang.System.out.println(rwHead);
    java.lang.System.out.println(content.length);
}
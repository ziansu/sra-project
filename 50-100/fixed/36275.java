private void appendInfo(java.lang.StringBuilder sb, java.lang.String title, long date, java.lang.String url) {
    title = title.replaceAll("\\|", "");
    sb.append(title).append("+").append(date).append("+").append(url);
}
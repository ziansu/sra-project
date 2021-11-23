public static fts.bean.Page getPage(java.lang.String url, java.lang.StringBuilder sb) {
    java.lang.String pageContent = sb.toString().replaceAll("<style\\b[^>]*>([\\s\\S]*?)</style>", "").replaceAll("<script\\b[^>]*>([\\s\\S]*?)</script>", "").replaceAll("<[^>]*>", " ").replaceAll("(\\s+)", " ").trim();
    return new fts.bean.Page(url, fts.bean.PageParser.getTitle(sb), pageContent);
}
public void addTargetRequests(java.util.List<java.lang.String> requests) {
    synchronized(targetRequests) {
        for (java.lang.String s : requests) {
            if (((org.apache.commons.lang3.StringUtils.isBlank(s)) || (s.equals("#"))) || (s.startsWith("javascript:"))) {
                break;
            }
            s = us.codecraft.webmagic.utils.UrlUtils.canonicalizeUrl(s, url.toString());
            targetRequests.add(new us.codecraft.webmagic.Request(s));
        }
    }
}
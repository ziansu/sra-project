public static us.codecraft.webmagic.Request createRequest(cn.wanru.fund.crawler.GenericPageable pageable) {
    java.lang.String url = java.lang.String.format(cn.wanru.fund.nav.crawl.eastmoney.EMUtil.url_template, 1, 40000, pageable.getCode(), pageable.getStart(), pageable.getEnd());
    us.codecraft.webmagic.Request request = new us.codecraft.webmagic.Request(url);
    cn.wanru.webmagic.PageUtil.setPageable(request, pageable);
    cn.wanru.webmagic.PageUtil.setSupportClass(request, cn.wanru.fund.nav.crawl.eastmoney.EMUtil.class);
    return request;
}
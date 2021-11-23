public static us.codecraft.webmagic.Request createRequest(cn.wanru.fund.crawler.GenericPageable pageable) {
    java.lang.String url = java.lang.String.format(cn.wanru.fund.nav.crawl.eastmoney.EMUtil.url_template, pageable.getCode(), 1, 40000, pageable.getStart(), pageable.getEnd());
    us.codecraft.webmagic.Request request = new us.codecraft.webmagic.Request(url);
    cn.wanru.webmagic.PageUtil.setPageable(request, pageable);
    cn.wanru.webmagic.PageUtil.setSupportClass(request, cn.wanru.fund.nav.crawl.eastmoney.EMUtil.class);
    return request;
}
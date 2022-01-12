@org.springframework.web.bind.annotation.RequestMapping(value = "/start")
public org.springframework.web.servlet.ModelAndView start(com.infofilter.model.SearchConfig sc) throws java.lang.InterruptedException {
    crawl.setSearchConfig(sc);
    crawl.run(sc.getUrlSeed());
    java.util.List<com.infofilter.model.UrlInfo> urlList = com.infofilter.crawl.Crawl.urlInfoList;
    org.springframework.web.servlet.ModelAndView mav = new org.springframework.web.servlet.ModelAndView("result");
    mav.addObject("urlList", urlList);
    return mav;
}
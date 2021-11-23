@java.lang.Override
public byte[] simpleGet(common.bean.HtmlInfo html) throws java.lang.Exception {
    synchronized(common.http.sub.WeixinHttpProcess.class) {
        if ((common.http.sub.WeixinHttpProcess.driver) == null) {
            common.http.sub.WeixinHttpProcess.driver = common.util.SeleniumDriverManager.getInstance().getPhantomJSDriver();
        }
    }
    common.http.sub.WeixinHttpProcess.driver.get(html.getOrignUrl());
    common.util.TimeUtil.rest(5);
    return common.http.sub.WeixinHttpProcess.driver.getPageSource().getBytes();
}
private java.lang.Class getHandleableClassOf(wuxian.me.spidersdk.control.HttpUrlNode node) {
    for (java.lang.Class clazz : wuxian.me.spidersdk.control.SpiderMethodManager.getSpiderClasses()) {
        java.lang.reflect.Method fromUrl = wuxian.me.spidersdk.control.SpiderMethodManager.getFromUrlMethod(clazz);
        try {
            wuxian.me.spidersdk.BaseSpider spider = ((wuxian.me.spidersdk.BaseSpider) (fromUrl.invoke(node)));
            if (spider != null) {
                return clazz;
            }else {
                continue;
            }
        } catch (java.lang.IllegalAccessException e) {
        } catch (java.lang.reflect.InvocationTargetException e) {
        }
    }
    return null;
}
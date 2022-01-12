@java.lang.Override
public void scan(android.content.Context context) {
    if (!(scanFlag)) {
        init();
        try {
            xmlParse.scan(context);
            scanPackage(context);
            scanFlag = true;
            createBean();
            com.smartions.ioc.log.IOCLogger.log(("beanPool size:" + (beanPool.size())));
        } catch (java.lang.Exception e) {
            scanFlag = false;
            e.printStackTrace();
            com.smartions.ioc.log.IOCLogger.log(("exception:" + (e.getLocalizedMessage())));
        }
    }
}
@java.lang.Override
public void scan(android.content.Context context) {
    if (!(scanFlag)) {
        init();
        try {
            xmlParse.scan(context);
            scanPackage(context);
            createBean();
            com.smartions.ioc.log.IOCLogger.log(("beanPool size:" + (beanPool.size())));
            scanFlag = true;
        } catch (java.lang.Exception e) {
            scanFlag = false;
            e.printStackTrace();
            com.smartions.ioc.log.IOCLogger.log(("exception:" + (e.getLocalizedMessage())));
        }
    }
}
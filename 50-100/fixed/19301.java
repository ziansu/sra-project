private void runApplication() {
    try {
        com.softserveinc.edu.ita.taskmanager.controller.XMLInitializeContext.init(XMLInitializeContext.XML_TASKS_FILE).parseTag(XMLInitializeContext.TAG_ATTR).loadIntoCache();
    } catch (java.lang.Exception e1) {
        e1.printStackTrace();
    }
    if ((application.getClass()) == (com.softserveinc.edu.ita.taskmanager.view.input.ConsoleApplication.class)) {
        application.start();
    }else
        if ((application.getClass()) == (com.softserveinc.edu.ita.taskmanager.view.input.WindowApplication.class)) {
            application.start();
        }
    
}
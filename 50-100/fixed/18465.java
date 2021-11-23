public static <E> E createPage(java.lang.Class<E> clazz, com.terminaldriver.tn5250j.obj.TerminalDriver driver) {
    E object = null;
    try {
        object = clazz.newInstance();
        com.terminaldriver.tn5250j.obj.ScreenObjectFactory.initElements(object, driver);
    } catch (java.lang.InstantiationException e) {
        e.printStackTrace();
    } catch (java.lang.IllegalAccessException e) {
        e.printStackTrace();
    }
    return object;
}
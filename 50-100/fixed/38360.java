public static void main(java.lang.String[] args) throws java.lang.ClassNotFoundException, java.lang.IllegalAccessException, java.lang.InstantiationException {
    main.ApplicationContext context = new main.ApplicationContext();
    main.interfaces.MessageRenderer renderer = ((main.interfaces.MessageRenderer) (context.getBean("renderer")));
    renderer.render();
    renderer = ((main.interfaces.MessageRenderer) (context.getBean("newrenderer")));
    renderer.render();
    java.lang.System.exit(0);
}
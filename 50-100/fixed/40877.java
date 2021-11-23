public static java.lang.String[] listPage() {
    java.lang.String[] list = new java.lang.String[AndroidDocConfig.CLASSES_LIST.length];
    for (int i = 0; i < (AndroidDocConfig.CLASSES_LIST.length); i++) {
        java.lang.String name = AndroidDocConfig.CLASSES_LIST[i].getName();
        name = name.replace('.', '/');
        name = ((AndroidDocConfig.BASE_PATH) + name) + ".html";
        list[i] = name;
    }
    return list;
}
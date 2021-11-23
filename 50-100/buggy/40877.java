public static java.util.List<java.lang.String> listPage() {
    java.util.List<java.lang.String> list = new java.util.ArrayList<java.lang.String>();
    for (int i = 0; i < (AndroidDocConfig.CLASSES_LIST.length); i++) {
        java.lang.String name = AndroidDocConfig.CLASSES_LIST[i].getName();
        name = name.replace('.', '/');
        name = ((AndroidDocConfig.BASE_PATH) + name) + ".html";
        list.add(name);
    }
    return list;
}
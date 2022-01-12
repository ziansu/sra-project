public void startFile(java.lang.Class<?> aClass) {
    document = com.dotcms.repackage.org.dom4j.DocumentHelper.createDocument();
    root = document.addElement("testsuite");
    name = aClass.getName();
    this.fileName = ("TEST-" + (name)) + ".xml";
    java.lang.System.out.print(("Generating XML report file: " + (this.fileName)));
}
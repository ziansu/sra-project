public synchronized void loadBeans(java.lang.String filePath) {
    initBeanParser(filePath);
    loadBeanTemplate(filePath);
    loadBeanInfo(filePath);
    this.getBeanData().setBeanObjects(filePath);
}
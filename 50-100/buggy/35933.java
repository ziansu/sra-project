public synchronized void loadBeans(java.lang.String... filePaths) {
    if (null == (this.getBeanParser())) {
        initBeanParser();
    }
    for (int i = 0; i < (filePaths.length); i++) {
        loadBeanTemplate(filePaths[i]);
        loadBeanInfo(filePaths[i]);
        this.getBeanData().setBeanObjects();
    }
}
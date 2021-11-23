public java.util.List<java.lang.String> getRootBeanNames() {
    java.util.List<java.lang.String> rootBeanNames = new java.util.ArrayList<java.lang.String>();
    for (java.lang.String rootViewName : this.rootViewNames) {
        for (java.lang.String beanName : this.viewNameToBeanNamesMap.get(rootViewName)) {
            if (isViewBeanNameValidForCurrentUI(beanName)) {
                rootBeanNames.add(beanName);
            }
        }
    }
    rootBeanNames.sort(this.orderComparator);
    return rootBeanNames;
}
public java.util.List<askme.ClassesEntity> getProductList(java.lang.String name) {
    classesList = classesSessionBean.getClasses(name);
    return classesList;
}
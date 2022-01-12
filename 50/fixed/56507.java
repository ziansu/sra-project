public java.util.List<askme.ClassesEntity> getProductList(int class_id) {
    classesList = classesSessionBean.getClasses(class_id);
    return classesList;
}
public static java.util.List copyBeans(java.util.List lis, java.lang.Class targetClazz) {
    java.util.List returnLis = new java.util.ArrayList<java.lang.Object>();
    for (java.lang.Object obj : lis) {
        try {
            java.lang.Object targetObj = targetClazz.newInstance();
            org.springframework.beans.BeanUtils.copyProperties(obj, targetObj);
            returnLis.add(targetObj);
        } catch (java.lang.Exception e) {
            e.printStackTrace();
        }
    }
    return returnLis;
}
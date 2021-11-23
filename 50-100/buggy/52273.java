public java.lang.String getValue(com.main.Attribute att) {
    if (att instanceof com.main.ContinuousAttribute) {
        java.lang.System.out.println(att.getClass());
        com.main.ContinuousAttribute cAtt = ((com.main.ContinuousAttribute) (att));
        return cAtt.getBucket(data.get(att));
    }
    return data.get(att);
}
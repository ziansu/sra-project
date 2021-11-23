@java.lang.SuppressWarnings(value = "unchecked")
protected java.util.List<?> createListFromContents(java.util.List<java.lang.Object> contents, java.lang.Class<?> clazz) throws ca.uqac.lif.azrael.SerializerException {
    java.util.List<java.lang.Object> out_list = null;
    try {
        out_list = ((java.util.List<java.lang.Object>) (clazz.newInstance()));
        for (java.lang.Object o : contents) {
            out_list.add(o);
        }
    } catch (java.lang.InstantiationException e) {
        throw new ca.uqac.lif.azrael.SerializerException(e);
    } catch (java.lang.IllegalAccessException e) {
        throw new ca.uqac.lif.azrael.SerializerException(e);
    }
    return out_list;
}
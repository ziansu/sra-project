public java.util.List<java.lang.String> asListString(javax.naming.directory.Attribute att) throws javax.naming.NamingException {
    java.util.List<java.lang.String> res = new java.util.LinkedList<java.lang.String>();
    if (att == null)
        return res;
    
    for (int i = 0; i < (att.size()); i++)
        res.add(((java.lang.String) (att.get(i))));
    
    return res;
}
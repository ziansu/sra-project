public java.util.List<java.lang.String> getCustomParamForID(int id) {
    java.util.List<java.lang.String> res = custparams.get(id);
    if (res == null)
        throw new java.lang.RuntimeException(("There was no registered custom parameter for the requested param ID " + id));
    
    return res;
}
public java.util.HashSet<dictionary.APIType> getTypesbyMethod(java.lang.String name) {
    java.util.HashSet<dictionary.APIType> types = new java.util.HashSet<dictionary.APIType>();
    java.util.HashSet<dictionary.APIMethod> methods = this.getMethodsByName(name);
    if (methods != null) {
        for (dictionary.APIMethod method : methods)
            types.add(method.getType());
        
        return types;
    }else {
        return null;
    }
}
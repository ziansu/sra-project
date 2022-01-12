public java.lang.String getFqStr(java.lang.String coreName) {
    java.util.Map<java.lang.String, java.lang.String> coreDefault = new java.util.HashMap<>();
    coreDefault.put("gene", "");
    coreDefault.put("mp", "*:*");
    coreDefault.put("disease", "*:*");
    coreDefault.put("anatomy", "*:*");
    coreDefault.put("impc_images", "*:*");
    coreDefault.put("allele2", "type:Allele");
    return coreDefault.get(coreName);
}
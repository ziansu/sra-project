protected void createTypeMap(java.util.Map<cc.recommenders.names.ICoReTypeName, java.util.List<cc.recommenders.usages.Usage>> typeToUsagesMap) {
    for (cc.recommenders.usages.Usage usage : pbnFullUsageList) {
        cc.recommenders.names.ICoReTypeName type = usage.getType();
        if (typeToUsagesMap.containsKey(type)) {
            typeToUsagesMap.get(type).add(usage);
        }else {
            typeToUsagesMap.put(type, com.google.common.collect.Lists.newArrayList());
        }
    }
}
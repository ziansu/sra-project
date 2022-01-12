public jcms.controller.Map<java.lang.String, java.lang.Long> getMemoryUsage() {
    final jcms.controller.Map<java.lang.String, java.lang.Long> memoryDetailsHashMap = new jcms.controller.HashMap();
    long totalMemory = java.lang.Runtime.getRuntime().totalMemory();
    long freeMemory = java.lang.Runtime.getRuntime().freeMemory();
    long usedMemory = totalMemory - freeMemory;
    memoryDetailsHashMap.put("total", totalMemory);
    memoryDetailsHashMap.put("free", freeMemory);
    memoryDetailsHashMap.put("used", usedMemory);
    return memoryDetailsHashMap;
}
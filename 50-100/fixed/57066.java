private void writeMapping(java.io.File outputDirectory, java.lang.String fileName, java.util.Map<java.lang.String, java.lang.String> index2instanceId) throws java.io.IOException {
    java.lang.StringBuilder sb = new java.lang.StringBuilder();
    sb.append("#Index\tDkProInstanceId\n");
    for (java.lang.String k : index2instanceId.keySet()) {
        sb.append((((k + "\t") + (index2instanceId.get(k))) + "\n"));
    }
    org.apache.commons.io.FileUtils.writeStringToFile(new java.io.File(outputDirectory, fileName), sb.toString(), "utf-8");
}
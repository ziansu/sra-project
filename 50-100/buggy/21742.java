public static java.util.List<com.springboot.model.Policy> deserialize() throws java.io.IOException {
    java.io.RandomAccessFile file = new java.io.RandomAccessFile(com.springboot.util.JsonUtils.filePath, "r");
    java.lang.String line;
    java.lang.String content;
    java.lang.StringBuffer sb = new java.lang.StringBuffer();
    while ((line = file.readLine()) != null) {
        sb.append(line);
    } 
    content = sb.toString();
    java.util.List<com.springboot.model.Policy> policyList = com.alibaba.fastjson.JSON.parseArray(content, com.springboot.model.Policy.class);
    java.lang.System.out.println(policyList.size());
    return policyList;
}
public org.springframework.core.io.Resource getResource() throws java.io.IOException {
    org.springframework.core.io.Resource res = resourceLoader.getResource("classpath:data/DataDump_mysql.txt");
    return res;
}
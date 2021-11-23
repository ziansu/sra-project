public void setMap() throws java.lang.Throwable {
    com.fasterxml.jackson.databind.ObjectMapper mapper = new com.fasterxml.jackson.databind.ObjectMapper();
    java.net.URL url = com.gescc.hedwig.vo.UserList.class.getResource("/data/user.json");
    java.io.File file = new java.io.File(url.toURI());
    java.util.Map<java.lang.String, com.gescc.hedwig.vo.User> list = mapper.readValue(file, new com.fasterxml.jackson.core.type.TypeReference<java.util.Map<java.lang.String, com.gescc.hedwig.vo.User>>() {    });
    this.map = list;
}
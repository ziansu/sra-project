public void setUser_role(java.lang.String user_role) throws com.fasterxml.jackson.core.JsonProcessingException {
    com.fasterxml.jackson.databind.ObjectMapper mapper = new com.fasterxml.jackson.databind.ObjectMapper();
    java.lang.String jsonInString = mapper.writeValueAsString(user_role);
    this.role = jsonInString;
}
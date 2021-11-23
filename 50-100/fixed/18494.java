@java.lang.Override
public com.wedriveu.services.authentication.entity.User getUser(java.lang.String username) {
    com.fasterxml.jackson.databind.ObjectMapper mapper = new com.fasterxml.jackson.databind.ObjectMapper();
    try {
        java.util.List<com.wedriveu.services.authentication.entity.User> users = mapper.readValue(file, new com.fasterxml.jackson.core.type.TypeReference<java.util.List<com.wedriveu.services.authentication.entity.User>>() {        });
        return getRequestedUuser(users, username);
    } catch (com.fasterxml.jackson.core.JsonGenerationException e) {
        e.printStackTrace();
    } catch (com.fasterxml.jackson.databind.JsonMappingException e) {
        e.printStackTrace();
    } catch (java.io.IOException e) {
        e.printStackTrace();
    }
    return null;
}
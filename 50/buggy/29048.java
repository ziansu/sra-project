public boolean deleteApi(java.lang.String id) throws java.io.IOException, uk.ac.open.kmi.basil.core.auth.exceptions.UserApiMappingException {
    userManager.deleteUserApiMap(id);
    return data.deleteSpec(id);
}
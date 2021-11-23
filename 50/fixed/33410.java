@java.lang.Override
public void afterPropertiesSet() throws java.lang.Exception {
    koyaClientParams = new java.util.HashMap<>();
    koyaClientParams.put("serverPath", companyAclService.getKoyaClientServerPath());
}
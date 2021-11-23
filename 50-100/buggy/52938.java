@org.springframework.web.bind.annotation.PostMapping(value = "tenantUserPolicy")
public void tenantUserPolicy(@org.springframework.web.bind.annotation.RequestParam(value = "tenantId", defaultValue = "tenant")
java.lang.String tenantId, @org.springframework.web.bind.annotation.RequestParam(value = "redisAddress", defaultValue = "localhost")
java.lang.String redisAddress, @org.springframework.web.bind.annotation.RequestParam(value = "domain", defaultValue = "demo-uva")
java.lang.String domain, @org.springframework.web.bind.annotation.RequestParam(value = "policy")
org.springframework.web.multipart.MultipartFile policyFile) {
    try {
        nl.uva.sne.daci.tenant.tenantadmin.TenantSvcImpl tsc = new nl.uva.sne.daci.tenant.tenantadmin.TenantSvcImpl(redisAddress, domain);
        if (!(tsc.checkTenant(tenantId))) {
            java.lang.System.out.println("Couldn't find the tenant");
            java.lang.System.err.println("Couldn't find the tenant");
            return ;
        }
        pap = new nl.uva.sne.daci.tenant.authzadmin.PAP(domain);
        pap.setIntratenantPolicy(redisAddress, new java.io.ByteArrayInputStream(policyFile.getBytes()));
    } catch (java.lang.Exception e) {
        throw new java.lang.RuntimeException("Couldn't set the User policies", e);
    }
}
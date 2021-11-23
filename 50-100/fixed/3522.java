@java.lang.Override
public gov.nist.hit.erx.core.service.TestContext testContext(java.lang.String path, com.fasterxml.jackson.databind.JsonNode formatObj, gov.nist.hit.erx.core.service.TestingStage stage) throws java.io.IOException {
    gov.nist.hit.erx.core.service.TestContext res = edirb.testContext(path, formatObj, stage);
    if (res != null)
        return res;
    
    res = xmlrb.testContext(path, formatObj, stage);
    return res;
}
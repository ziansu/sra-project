@java.lang.Override
public gov.nist.hit.erx.core.service.TestContext testContext(java.lang.String path, com.fasterxml.jackson.databind.JsonNode formatObj, gov.nist.hit.erx.core.service.TestingStage stage, gov.nist.hit.erx.core.service.TestStep testStep) throws java.io.IOException {
    gov.nist.hit.erx.core.service.TestContext res = edirb.testContext(path, formatObj, stage, testStep);
    if (res != null)
        return res;
    
    res = xmlrb.testContext(path, formatObj, stage, testStep);
    return res;
}
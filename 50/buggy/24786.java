@javax.annotation.PostConstruct
private void init() throws java.lang.Exception {
    hospitalOrgInfo = this.initOrgInfo(hospitalInfoConfig);
    insuranceOrgInfo = this.initOrgInfo(insuranceInfoConfig);
}
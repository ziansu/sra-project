@javax.annotation.PostConstruct
private void init() throws java.lang.Exception {
    insuranceOrgInfo = this.initOrgInfo(insuranceInfoConfig);
    hospitalOrgInfo = this.initOrgInfo(hospitalInfoConfig);
}
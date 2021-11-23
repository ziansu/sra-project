@java.lang.Override
public void afterPropertiesSet() throws java.lang.Exception {
    this.offeringDescription = getOfferingDescription();
    this.provider.register(getOfferingDescription());
    this.enableSwagger(offeringDescription);
}
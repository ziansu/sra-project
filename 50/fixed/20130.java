public void checkWrongJumpMethod() {
    org.apache.sling.api.resource.ResourceResolver resourceResolver = null;
    try {
        resourceResolver = com.example.SampleServlet.getResourceResolverForUserNestedInit(resourceResolverFactory);
    } catch (org.apache.sling.api.resource.LoginException e) {
        e.printStackTrace();
    } finally {
        if (resourceResolver != null) {
        }
    }
}
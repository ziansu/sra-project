public business.WSClient.IBusiness getBusinessIFace(java.lang.String businessName) {
    try {
        business.WSClient.BusinessWSImplService businessService = new business.WSClient.BusinessWSImplService();
        business.WSClient.IBusiness iBusiness = businessService.getBusinessWSImplPort();
        return iBusiness;
    } catch (java.lang.Exception e) {
        java.lang.System.out.println(e.getMessage());
    }
    return null;
}
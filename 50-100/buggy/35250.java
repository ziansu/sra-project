public static void updatePublisherBusiness(java.lang.String auth, org.uddi.api_v3.BusinessEntity biz, org.uddi.v3_service.UDDIPublicationPortType pub) throws java.lang.Exception {
    biz.getName().add(new org.uddi.api_v3.Name("Updated Name", "en"));
    org.uddi.api_v3.SaveBusiness sb = new org.uddi.api_v3.SaveBusiness();
    sb.setAuthInfo(auth);
    sb.getBusinessEntity().add(biz);
    pub.saveBusiness(sb);
}
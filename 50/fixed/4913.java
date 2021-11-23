@org.junit.Test
public void testCreateGlobalMarketplaceMarketplaceIdInUse() throws java.lang.Exception {
    org.oscm.vo.VOMarketplace marketplace = org.oscm.ws.MarketplaceServiceWSTest.factory.createMarketplaceVO(org.oscm.ws.MarketplaceServiceWSTest.PLATFORM_OPERATOR, false, "localMp");
    marketplace.setMarketplaceId(null);
    org.oscm.ws.MarketplaceServiceWSTest.mpService_Supplier.createMarketplace(marketplace);
}
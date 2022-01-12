@org.junit.Test
public void test_createHUQueryBuilder_WithAfterPickingLocators_Warehouse01_BPartner01() {
    setAfterPickingLocators(true);
    huSelectModel_SelectedWarehouse_ID = warehouse01.getM_Warehouse_ID();
    huSelectModel_SelectedBPartner_ID = bpartner01.getC_BPartner_ID();
    huSelectModel_SelectedBPartnerLocation_ID = bpartner01_loc01.getC_BPartner_Location_ID();
    org.junit.Assert.assertEquals("Invalid HUs retrieved", java.util.Arrays.asList(hu_bp01_wh01_active, hu_bp01_wh01_picked, hu_bp01_wh01_shipped), huSelectModel.createHUQueryBuilder().list());
}
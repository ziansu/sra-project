@org.junit.Test
public void test_createHUQueryBuilder_Warehouse01() {
    huSelectModel_SelectedWarehouse_ID = warehouse01.getM_Warehouse_ID();
    org.junit.Assert.assertEquals("Invalid HUs retrieved", java.util.Arrays.asList(hu_bp01_wh01_active, hu_bp01_wh01_picked, hu_bp02_wh01_active, hu_bp03loc01_wh01_active, hu_bp03loc02_wh01_active), huSelectModel.createHUQueryBuilder().list());
}
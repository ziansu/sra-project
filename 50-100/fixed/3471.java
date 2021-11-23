@org.junit.Test
public void testCSVZipFile() throws java.lang.Exception {
    java.net.URL path = com.servinglynk.hmis.warehouse.dao.BulkUploaderTest.class.getResource("2015.xml");
    com.servinglynk.hmis.warehouse.model.base.BulkUpload bullkUpload = new com.servinglynk.hmis.warehouse.model.base.BulkUpload();
    bullkUpload.setInputpath(path.getPath());
    bullkUpload.setId(3L);
    com.servinglynk.hmis.warehouse.model.base.ProjectGroupEntity projectGrpEntity = new com.servinglynk.hmis.warehouse.model.base.ProjectGroupEntity();
}
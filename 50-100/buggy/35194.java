@org.junit.Test
public void updateBathGroomingTest() {
    br.com.bovdog.bean.BathGrooming bathGrooming = setupBathGrooming();
    bathGrooming = bathGroomingService.createBathGrooming(bathGrooming);
    assertEquals(testDao.getObjectById(bathGrooming.getId(), br.com.bovdog.bean.BathGrooming.class).getServiceBathGrooming(), "Service");
    bathGrooming.setServiceBathGrooming("ServiceUpdate");
    bathGrooming = bathGroomingService.updateBathGrooming(bathGrooming);
    assertEquals(testDao.getObjectById(bathGrooming.getId(), br.com.bovdog.bean.BathGrooming.class).getServiceBathGrooming(), "ServiceUpdate");
}
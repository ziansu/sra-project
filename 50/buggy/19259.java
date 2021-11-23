@org.junit.Test
public void orderRoom() throws java.lang.Exception {
    org.lab_manager.controller.LabController c = new org.lab_manager.controller.LabController();
    c.orderRoom("132", "假的实验", "T001", "第四周", "2,3节");
}
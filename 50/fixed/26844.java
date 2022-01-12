@org.junit.AfterClass
public static void tearDownAfterTest() {
    edu.fudan.ooad.operation.BaseOperation.delete(edu.fudan.ooad.test.EquipmentTest.equipment);
    edu.fudan.ooad.operation.BaseOperation.delete(edu.fudan.ooad.test.EquipmentTest.type);
}
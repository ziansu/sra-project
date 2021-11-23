@org.junit.AfterClass
public static void tearDown() {
    edu.fudan.ooad.operation.BaseOperation.delete(edu.fudan.ooad.test.RecordTest.tv);
    edu.fudan.ooad.operation.BaseOperation.delete(edu.fudan.ooad.test.RecordTest.equipment);
    edu.fudan.ooad.operation.BaseOperation.delete(edu.fudan.ooad.test.RecordTest.plan);
}
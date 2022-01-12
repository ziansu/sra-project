@org.junit.Test
public void testCountNumbers() {
    int result;
    test.TestObject testObject;
    testObject = new test.TestObject(testnumbers);
    result = testObject.run(int.class, "countNumbers", 1);
    assertEquals(sheet3.a_tuple.NaturalNumberTupleTest.standardMessage("countNumbers(1)", testnumbers), 1, result);
    testObject = new test.TestObject(testnumbers2);
    result = testObject.run(int.class, "countNumbers", 490);
    assertEquals(sheet3.a_tuple.NaturalNumberTupleTest.standardMessage("countNumbers(490)", testnumbers2), 3, result);
}
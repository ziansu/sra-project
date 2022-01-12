@org.testng.annotations.Test
public void testUDFEnoughInput() throws java.lang.Exception {
    org.apache.pig.data.Tuple tuple = org.apache.pig.data.TupleFactory.getInstance().newTuple(31);
    for (int i = 0; i < 31; i++) {
        tuple.set(i, 0);
    }
    tuple.set(0, "M");
    org.apache.pig.data.DataBag dataBag = instance.exec(tuple);
    org.testng.Assert.assertEquals(30, dataBag.size());
    org.testng.Assert.assertEquals(dataBag.iterator().next().size(), 5);
}
@org.junit.Test
public void testTop() {
    edu.kis.vh.stacks.StackFIFO stackObj = new edu.kis.vh.stacks.StackFIFO();
    final int EMPTY_STACK_VALUE = 0;
    int result = stackObj.top();
    org.junit.Assert.assertEquals(EMPTY_STACK_VALUE, result);
    int testValue = 4;
    stackObj.push(testValue);
    int testValue1 = 5;
    stackObj.push(testValue1);
    result = stackObj.top();
    org.junit.Assert.assertEquals(testValue, result);
    result = stackObj.top();
    org.junit.Assert.assertEquals(testValue, result);
}
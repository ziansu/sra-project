@org.junit.Test
public void testPop() {
    edu.kis.vh.stacks.IStack stackObj = new edu.kis.vh.stacks.Stack();
    final int EMPTY_STACK_VALUE = 0;
    int result = stackObj.pop();
    org.junit.Assert.assertEquals(EMPTY_STACK_VALUE, result);
    int testValue = 4;
    stackObj.push(testValue);
    result = stackObj.pop();
    org.junit.Assert.assertEquals(testValue, result);
    result = stackObj.pop();
    org.junit.Assert.assertEquals(EMPTY_STACK_VALUE, result);
}
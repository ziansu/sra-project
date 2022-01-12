@org.junit.Test
public void testCountNumbersWithUniqueDigitsConstantTime() {
    com.javapractice.leetcode.CountNumbersWithUniqueDigits test = new com.javapractice.leetcode.CountNumbersWithUniqueDigits();
    assertEquals(test.countNumbersWithUniqueDigitsConstantTime(0), 1);
    assertEquals(test.countNumbersWithUniqueDigitsConstantTime(2), 91);
    assertEquals(test.countNumbersWithUniqueDigitsConstantTime(12), 8877691);
}
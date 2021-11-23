@org.junit.Test
public void testCountNumbersWithUniqueDigitsConstantTime() {
    com.javapractice.leetcode.CountNumbersWithUniqueDigits test = new com.javapractice.leetcode.CountNumbersWithUniqueDigits();
    org.junit.Assert.assertArrayEquals(test.countNumbersWithUniqueDigitsConstantTime(0), 1);
    org.junit.Assert.assertArrayEquals(test.countNumbersWithUniqueDigitsConstantTime(2), 91);
    org.junit.Assert.assertArrayEquals(test.countNumbersWithUniqueDigitsConstantTime(12), 8877691);
}
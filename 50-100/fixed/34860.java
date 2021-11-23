@org.junit.Test
public void returnsTheOnlyNegativeOddNumberWhenAllOtherNumbersAreEven() {
    com.malsr.codewars.FindParityOutlier parityOutlier = new com.malsr.codewars.FindParityOutlier();
    java.lang.System.out.println(((-3) % 2));
    int[] numbersToFind = new int[]{ 2 , 4 , -3 , 8 , 100 , 220 };
    assertEquals("", (-3), parityOutlier.find(numbersToFind));
}
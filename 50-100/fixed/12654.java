@org.junit.Test
public void checkAvg() throws java.lang.Exception {
    com.wolkabout.hexiwear.StepCountActivity step = new com.wolkabout.hexiwear.StepCountActivity();
    double[] array = new double[7];
    int count = 0;
    while (count != 7) {
        array[count] = 10 * count;
        count++;
    } 
    double weekly = step.stepAvgWeek(array);
    java.lang.System.out.println(weekly);
    assertTrue(((weekly == 30.0) || (weekly == 30)));
}
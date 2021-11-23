@org.junit.Test
public void TestgetLecRatingCounts() {
    course.setRatingsOverTime();
    java.util.ArrayList<java.lang.Integer> actual = course.getLecRatingCounts(1);
    java.util.ArrayList<java.lang.Integer> expected = new java.util.ArrayList<>(java.util.Arrays.asList(0, 0, 0));
    org.junit.Assert.assertEquals(expected, actual);
    actual = course.getLecRatingCounts(2);
    expected = new java.util.ArrayList<>(java.util.Arrays.asList(0, 0, 1));
    org.junit.Assert.assertEquals(expected, actual);
}
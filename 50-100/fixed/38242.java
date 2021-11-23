@org.junit.Test
public void testResultCount() {
    int count = 10;
    info.dyndns.overflow.java.FizzBuzz fb = info.dyndns.overflow.java.FizzBuzzFactory.newForkJoinFizzBuzz(count);
    assertEquals(((("count:" + count) + " result:") + (fb.result().size())), (count - 1), fb.result());
}
@org.junit.Test
public void testCanCaptureAndCanMove() {
    setUp1();
    board.print();
    junit.framework.Assert.assertTrue(captureTestShouldReturnTrue1());
    setUp2();
    junit.framework.Assert.assertTrue(captureTestShouldReturnTrue2());
    setUp3();
    junit.framework.Assert.assertTrue(moveTestShouldReturnTrue3());
    setUp4();
    junit.framework.Assert.assertTrue(moveTestShouldReturnTrue4());
}
@org.junit.Test
public void cancellationIsSignalled() throws java.io.IOException, java.lang.InterruptedException {
    scanner.close();
    org.mockito.Mockito.verify(cancellationToken, org.mockito.Mockito.times(1)).cancel();
}
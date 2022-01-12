@org.junit.Test
public void longIntegersMultipied() {
    long a = 1199747L;
    long b = 1062911L;
    org.junit.Assert.assertEquals(1275224283517L, (a * b));
    org.junit.Assert.assertEquals((-1275224283517L), (a * (-b)));
    a = 229767376164L;
    b = 907271478890L;
    org.junit.Assert.assertEquals((-5267604004427634456L), (a * b));
    org.junit.Assert.assertEquals(5267604004427634456L, (a * (-b)));
}
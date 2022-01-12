@org.junit.Test
public void longIntegersMultipied() {
    long a = 1199747L;
    long b = 1062911L;
    assertEquals(1275224283517L, (a * b));
    assertEquals((-1275224283517L), (a * (-b)));
    a = 229767376164L;
    b = 907271478890L;
    assertEquals((-5267604004427634456L), (a * b));
    assertEquals(5267604004427634456L, (a * (-b)));
}
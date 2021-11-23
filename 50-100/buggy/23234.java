@org.junit.Test
public void testParallel() {
    java.lang.Comparable[] array = new java.lang.Comparable[]{ 10 , 1 , 9 , 2 , 8 , 3 , 7 , 4 , 6 , 5 };
    de.hsMannheim.informatik.tpe.ss17.repo27.uebung4.aufgabe2.QuickSortParallel qsp = new de.hsMannheim.informatik.tpe.ss17.repo27.uebung4.aufgabe2.QuickSortParallel();
    qsp.sort(array);
    java.lang.String s = "1 2 3 4 5 6 7 8 9 10";
    assertEquals("Gleich: ", s, qsp.toString());
}
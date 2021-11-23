@org.junit.Test
public void TIME_CREATEDtest() {
    for (int i = 0; i < (sort.size()); i++) {
        sort.get(i).setSortType(3);
    }
    correct.add(sort.get(0));
    correct.add(sort.get(1));
    correct.add(sort.get(2));
    java.util.Collections.sort(sort);
    assertTrue(sort.equals(correct));
}
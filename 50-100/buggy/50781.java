public static void comparePopulation() {
    int count = 0;
    for (int i = 0; i < (Driver.oldPopulation.size()); i++) {
        if ((Driver.oldPopulation.get(i)) == (Driver.newPopulation.get(i))) {
            count++;
        }else {
        }
    }
    java.lang.System.out.println(("Count: " + count));
}
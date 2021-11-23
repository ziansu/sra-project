private void printGrid() {
    for (int[] r : grid) {
        for (int c : r) {
            switch (c) {
                case 0 :
                    java.lang.System.out.print(".");
                    break;
                case 1 :
                    java.lang.System.out.print("*");
                    break;
            }
        }
        java.lang.System.out.println();
    }
}
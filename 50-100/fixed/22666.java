void outputList() {
    for (int i = 0; i < (discs.size()); i++) {
        Solution1.Disc element = discs.get(i);
        java.lang.System.out.println(((("---------- " + "disc: ") + (element.discNum)) + " ----------"));
        java.lang.System.out.printf("pos:\t%d(%d)\ntime:\t%d\n", element.atPosition, element.numPos, element.atTime);
    }
}
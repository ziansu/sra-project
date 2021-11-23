public static void turnPage(int i) {
    if ((((Reader.currentPage) + i) < 1) || (((Reader.currentPage) + i) > (Reader.pages))) {
        java.lang.System.out.println("No more pages to turn!");
    }else {
        Reader.currentPage += i;
        java.lang.System.out.println(("Page #" + (Reader.currentPage)));
    }
}
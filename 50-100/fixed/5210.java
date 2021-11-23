public void addPages() {
    listOfPages = new java.util.ArrayList();
    if ((totalBookCount) == 0) {
        listOfPages.clear();
    }else {
        int counter = (((totalBookCount) % (booksPerPage)) == 0) ? (totalBookCount) / (booksPerPage) : ((totalBookCount) / (booksPerPage)) + 1;
        for (int i = 1; i <= counter; i++) {
            listOfPages.add(i);
        }
    }
}
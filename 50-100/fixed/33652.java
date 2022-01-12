public void display(com.twu.biblioteca.BookList list) {
    bookList = ((java.util.ArrayList<java.lang.String[][]>) (list.getDetails()));
    for (java.lang.String[][] details : bookList) {
        for (int j = 0; j < (details.length); j++)
            java.lang.System.out.println(((("\t" + (j + 1)) + ". ") + (details[j][0])));
        
    }
}
private int searchForMovie() {
    java.lang.String search = "";
    boolean foundMovie = false;
    while (foundMovie == false) {
        cls();
        java.lang.System.out.print("Search term (only title): ");
        search = scan.getLine();
        if ((lib.findMovie(search)) >= 0) {
            foundMovie = true;
        }else {
            java.lang.System.out.println("Could not find the movie. Try Again! Want to try again? Yes or no?");
            if (scan.getLine().equalsIgnoreCase("no")) {
                return -1;
            }
        }
    } 
    return lib.findMovie(search);
}
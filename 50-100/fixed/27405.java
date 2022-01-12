public static java.util.ArrayList<java.lang.String> readHighscore() throws java.io.FileNotFoundException {
    try (java.util.Scanner sc = new java.util.Scanner(new java.io.File(lasersharks.Highscores.inputFile))) {
        java.util.ArrayList<java.lang.String> list = new java.util.ArrayList<java.lang.String>();
        while (sc.hasNextLine()) {
            list.add(sc.nextLine());
        } 
        return list;
    }
}
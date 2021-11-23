public static java.util.Set<java.lang.String> makeDictionary() {
    java.util.Set<java.lang.String> words = new java.util.HashSet<java.lang.String>();
    java.util.Scanner infile = null;
    try {
        infile = new java.util.Scanner(new java.io.File("five_letter_words.txt"));
    } catch (java.io.FileNotFoundException e) {
        java.lang.System.out.println("Dictionary File not Found!");
        e.printStackTrace();
        java.lang.System.exit(1);
    }
    while (infile.hasNext()) {
        words.add(infile.next());
    } 
    return words;
}
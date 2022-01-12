private static WordTree<java.lang.String> buildTree(java.io.File inFile) throws java.io.IOException {
    WordTree<java.lang.String> wt = new WordTree<java.lang.String>();
    java.util.Scanner words = new java.util.Scanner(inFile);
    int counter = 0;
    while (words.hasNextLine()) {
        wt.add(words.nextLine());
    } 
    words.close();
    return wt;
}
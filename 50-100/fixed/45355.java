public void readFile(java.lang.String filename) throws java.io.FileNotFoundException {
    java.util.Scanner file = new java.util.Scanner(new java.io.File(filename));
    this.partsOfSpeech = file.nextLine().split("%");
    file.reset();
    java.lang.String pattern = "[%]*";
    title = file.nextLine();
    while ((!(file.hasNext(pattern))) && (file.hasNext())) {
        java.lang.String line1 = file.next();
        textFile.add(line1);
    } 
}
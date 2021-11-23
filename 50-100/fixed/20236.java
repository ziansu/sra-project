public void readFile() throws java.io.IOException {
    fr = new java.io.FileReader("file.txt");
    br = new java.io.BufferedReader(fr);
    int line = 0;
    while ((line = br.read()) != (-1)) {
        char actualChar = ((char) (line));
        output += actualChar;
        if ((actualChar > 33) && (actualChar < 132)) {
            charArrayList.add(actualChar);
        }
    } 
}
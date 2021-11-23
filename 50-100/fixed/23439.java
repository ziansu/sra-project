public static void main(java.lang.String[] args) throws java.io.FileNotFoundException {
    java.io.File input = new java.io.File("C:\\temp\\_input.txt");
    java.util.Scanner cin = new java.util.Scanner(new java.io.FileInputStream(input), "UTF-8");
    java.lang.StringBuilder sb = new java.lang.StringBuilder();
    while (cin.hasNextLine()) {
        sb.append(cin.nextLine()).append(java.lang.System.lineSeparator());
    } 
}
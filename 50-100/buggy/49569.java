public static void main(java.lang.String[] args) {
    try {
        java.io.BufferedReader in = new java.io.BufferedReader(new java.io.FileReader(args[0]));
        java.lang.String boardstring = in.readLine();
        SudokuBoard sb = new SudokuBoard(boardstring);
        java.lang.System.out.println(sb.toPrettyString());
    } catch (java.io.FileNotFoundException e) {
        java.lang.System.out.println("File not found");
    } catch (java.io.IOException e) {
        java.lang.System.out.println("IO Exception.");
    }
}
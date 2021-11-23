public static void main(java.lang.String[] args) {
    Parser parser = new Parser();
    parser.readNodes();
    parser.readProbabilities();
    parser.readQuerys();
    java.lang.System.out.println("END");
}
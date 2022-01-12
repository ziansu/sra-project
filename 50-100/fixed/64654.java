public void parse(java.io.File asm) throws java.lang.Exception {
    labels = new java.util.HashMap<java.lang.String, java.lang.Integer>();
    firstPass(new java.util.Scanner(asm));
    java.util.Scanner in = new java.util.Scanner(asm);
    while (in.hasNextLine()) {
        for (java.lang.String token : splitLine(stripComment(in.nextLine()))) {
            processToken(token);
        }
    } 
}
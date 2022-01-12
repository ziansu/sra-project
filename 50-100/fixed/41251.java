public static void main(java.lang.String[] args) throws java.lang.Exception {
    java.io.BufferedReader br = new java.io.BufferedReader(new java.io.InputStreamReader(java.lang.System.in));
    while (true) {
        java.lang.String input = br.readLine();
        if ((input.compareTo("quit")) == 0) {
            break;
        }
        InstructorMenu.courseReport(java.lang.Integer.valueOf(input));
    } 
}
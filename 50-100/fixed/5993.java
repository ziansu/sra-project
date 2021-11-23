public static void EchoInput(java.util.ArrayList<java.lang.String> options) {
    java.lang.String output = "";
    for (java.lang.String option : options) {
        if (option.equals("-h")) {
            java.lang.System.out.println("Command syntax:\n\techo [-h] input\n\nPrints the specified input to the console.");
            return ;
        }else
            output += option + " ";
        
    }
    output = output.substring(0, ((output.length()) - 1));
    java.lang.System.out.println(output);
}
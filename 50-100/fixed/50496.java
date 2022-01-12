private java.lang.String calc(java.lang.String input) {
    java.util.Random rand = new java.util.Random();
    java.lang.StringBuilder in = new java.lang.StringBuilder(input);
    java.lang.StringBuilder out = new java.lang.StringBuilder();
    while ((in.length()) != 0) {
        int index = rand.nextInt(in.length());
        out.append(in.charAt(index));
        in.deleteCharAt(index);
    } 
    java.lang.String output = out.toString();
    return output;
}
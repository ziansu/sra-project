public static void main(java.lang.String[] args) {
    java.lang.String reversed = ".eslaf eb t'ndluow ecnetnes siht ,dehctiws erew eslaf dna eurt fo sgninaem eht fI";
    java.lang.String temporaryString = "";
    for (int i = (reversed.length()) - 1; i > 0; i--) {
        temporaryString = temporaryString.concat(java.lang.Character.toString(reversed.charAt(i)));
    }
    reversed = temporaryString;
    java.lang.System.out.println(reversed);
}
public static void main(java.lang.String[] args) {
    java.lang.System.out.println("Morse code program by Andrew Bevelhymer");
    if ((args.length) < 1) {
        MorseCode.usage();
    }
    if (args[0].equals("-e")) {
        MorseCode.encode();
    }else
        if (args[0].equals("-d")) {
            MorseCode.decode();
        }else {
            MorseCode.usage();
        }
    
}
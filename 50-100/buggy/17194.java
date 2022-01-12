public java.lang.String Sniffer() throws java.text.ParseException {
    java.util.Scanner scanner = new java.util.Scanner(java.lang.System.in);
    java.lang.System.out.print("Enter some lyrics: ");
    java.lang.String lyrics = scanner.nextLine();
    lyrics = lyrics.replaceAll("[^A-Za-z0-9 ]", "");
    scanner.close();
    if ((lyrics.length()) == 0) {
        java.lang.System.out.println("Please enter in valid lyrics - TERMINATING PROGRAM");
        java.lang.System.exit(0);
    }
    return lyrics;
}
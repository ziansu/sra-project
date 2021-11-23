public static void main(java.lang.String[] args) {
    java.util.Scanner scan = new java.util.Scanner(java.lang.System.in);
    java.lang.System.out.print("Enter text or morse code to be translated: ");
    java.lang.String str = scan.nextLine();
    java.lang.String[] phrase = str.split("\\s");
    java.lang.String translation = "Unable to translate";
    if ((str.startsWith(".")) || (str.startsWith("-"))) {
        translation = translator.TranslateFromMorse(phrase);
    }else {
        translation = translator.TranslateFromEnglish(phrase);
    }
    java.lang.System.out.println(translation);
}
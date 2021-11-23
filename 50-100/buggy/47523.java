public static void main(java.lang.String[] args) {
    java.util.Scanner input = new java.util.Scanner(java.lang.System.in);
    java.lang.String s;
    int words = 0;
    java.lang.System.out.println("Enter as many words as you would like.");
    do {
        s = input.nextLine();
        words++;
    } while (!(s.equalsIgnoreCase("exit")) );
    java.lang.System.out.println((("You entered a total of " + words) + " words."));
}
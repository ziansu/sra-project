public static void main(java.lang.String[] args) {
    java.lang.System.out.println("TEST START!!!");
    main.akane.Akane akaneInstance = main.akane.Akane.getInstance();
    java.util.Scanner sc = new java.util.Scanner(java.lang.System.in);
    java.lang.String sendWord;
    do {
        sendWord = sc.nextLine();
        java.lang.System.out.println(akaneInstance.toSay(sendWord));
    } while (!(sendWord.equals(test.TestRun.exitCommand)) );
    java.lang.System.out.println("Akane is sleeping.....zzz");
}
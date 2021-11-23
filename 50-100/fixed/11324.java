public static void inputData() {
    java.util.Scanner scanner = new java.util.Scanner(java.lang.System.in);
    Exam01.IDCard.str = scanner.next();
    Exam01.IDCard.arr = new java.lang.String[Exam01.IDCard.str.length()];
    for (int i = 0; i < (Exam01.IDCard.str.length()); i++) {
        Exam01.IDCard.arr[i] = Exam01.IDCard.str.substring(i, (i + 1));
    }
}
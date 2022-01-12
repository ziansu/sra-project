public static void run() throws java.lang.Exception {
    java.lang.System.out.println("2. Бесконечная последовательность");
    java.lang.System.out.println("Возьмём бесконечную цифровую последовательность, образованную склеиванием последовательных положительных");
    java.lang.System.out.println("чисел: S = 123456789101112131415...");
    java.lang.System.out.println("Определите первое вхождение заданной последовательности A в бесконечной последовательности S (нумерация");
    java.lang.System.out.println("начинается с 1).");
    java.util.ArrayList<java.lang.String> searchList = new java.util.ArrayList<java.lang.String>();
    ru.hh.school.zhdanov.Problem2.getListFromFile(searchList);
    ru.hh.school.zhdanov.Problem2.brute(searchList);
}
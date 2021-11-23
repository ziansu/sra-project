public static void fizzbuzz(int fizz) {
    for (int i = 1; i <= (edu.cnm.deepdive.fizzbuzzpractice.FizzBuzz.UPPER_LIMIT); i++) {
        if (((i % 3) == 0) && ((i % 5) == 0)) {
            java.lang.System.out.println("fizzbuzz");
        }
        if ((i % 3) == 0) {
            java.lang.System.out.println("fizz");
        }
        if ((i % 5) == 0) {
            java.lang.System.out.println("buzz");
        }else {
            java.lang.System.out.println(i);
        }
    }
}
public static void fizzbuzz(int fizz) {
    for (int i = 0; i <= (edu.cnm.deepdive.fizzbuzzpractice.FizzBuzz.UPPER_LIMIT); i++) {
        if ((i % 3) == 0) {
            java.lang.System.out.println("fizz");
        }
        if ((i % 5) == 0) {
            java.lang.System.out.println("buzz");
        }
        if (((i % 3) == 0) && ((i % 5) == 0)) {
            java.lang.System.out.println("fizzbuzz");
        }else {
            java.lang.System.out.println(i);
        }
    }
}
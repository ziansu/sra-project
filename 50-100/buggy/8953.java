public static void toh(int n, char src, char dest, char aux) {
    if (n > 0) {
        com.datastructure.stack.problems.TowersOfHanoi.toh((n - 1), src, dest, aux);
        java.lang.System.out.println(((((n + " ") + src) + "-") + dest));
        com.datastructure.stack.problems.TowersOfHanoi.toh((n - 1), dest, aux, src);
    }
}
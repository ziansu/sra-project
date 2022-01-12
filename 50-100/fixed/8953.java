public static void toh(int n, char src, char aux, char dest) {
    if (n > 0) {
        com.datastructure.stack.problems.TowersOfHanoi.toh((n - 1), src, dest, aux);
        java.lang.System.out.println(((((n + " ") + src) + "-") + dest));
        com.datastructure.stack.problems.TowersOfHanoi.toh((n - 1), aux, src, dest);
    }
}
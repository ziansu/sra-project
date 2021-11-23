public static void main(java.lang.String[] args) {
    java.util.Scanner sc = new java.util.Scanner(java.lang.System.in);
    int n = sc.nextInt();
    java.lang.String[] jars = new java.lang.String[n];
    for (int i = 0; i < n; i++) {
        jars[i] = sc.next();
    }
    com.hutgroup.robocode.server.Main.runner(jars, 10, 2, 5, 15, 500, 500, 100);
}
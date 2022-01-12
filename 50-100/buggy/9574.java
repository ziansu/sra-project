public static void main(java.lang.String[] args) {
    java.util.Scanner sc = new java.util.Scanner(java.lang.System.in);
    float sum = 0.0F;
    for (int i = 0; i < (q1004.Main.INPUT_COUNT); i++) {
        java.lang.Float f = sc.nextFloat();
        if (f <= 0) {
            continue;
        }
        sum += f;
    }
    sum /= q1004.Main.INPUT_COUNT;
    java.lang.System.out.println(("$" + (q1004.Main.shortenNumber(sum))));
}
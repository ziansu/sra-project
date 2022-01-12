public static void main(java.lang.String[] args) {
    int j = 0;
    int i;
    for (i = 0; i < 500; i++ , j++) {
        if (!(Flik.isSameNumber(i, j))) {
            break;
        }
    }
    java.lang.System.out.println(("i is " + i));
}
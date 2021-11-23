public static void main(java.lang.String[] args) {
    int i = 0;
    for (int j = 0; i < 500; ++i , ++j) {
        if (!(Flik.isSameNumber(i, j))) {
            break;
        }
    }
    java.lang.System.out.println(("i is " + i));
}
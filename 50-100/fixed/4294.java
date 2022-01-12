public static void main(java.lang.String[] args) {
    java.lang.String s;
    java.util.Scanner sc = new java.util.Scanner(java.lang.System.in);
    boolean flag = true;
    int i = 0;
    while (flag) {
        s = sc.nextLine();
        if ((s.length()) == 0) {
            flag = false;
        }else {
            i++;
            java.lang.System.out.println(((i + " ") + s));
        }
    } 
}
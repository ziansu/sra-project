public static void main(java.lang.String[] args) {
    java.lang.System.out.print("Please type a String: ");
    java.util.Scanner sc = new java.util.Scanner(java.lang.System.in);
    java.lang.String str = sc.nextLine();
    java.lang.System.out.print("Please type an Int: ");
    int idx = sc.nextInt();
    str = com.nc.q5.Q5.substring(str, idx);
    java.lang.System.out.println(str);
}
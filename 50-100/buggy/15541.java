public static void main(java.lang.String[] args) throws java.io.IOException {
    java.lang.String name = args[1];
    java.lang.String file = args[0];
    MessagePasser mp = new MessagePasser(file, name);
    while (true) {
        java.lang.System.out.println(">>");
        java.util.Scanner sc = new java.util.Scanner(java.lang.System.in);
        java.lang.String str = sc.nextLine();
        java.lang.String[] s = str.split(" ");
        mp.send(s[0], s[1]);
    } 
}
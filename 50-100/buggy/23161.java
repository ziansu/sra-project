public static void main(java.lang.String[] args) {
    jkhet.Controller.k = new java.util.Scanner(java.lang.System.in);
    while (true) {
        java.lang.System.out.print("Begin JKhet with cli (1) or gui (2)? ");
        java.lang.String response = jkhet.Controller.k.nextLine();
        switch (response) {
            case "1" :
                jkhet.Controller.cli();
                return ;
            case "2" :
                jkhet.Controller.gui();
                return ;
            default :
                java.lang.System.out.println("Invalid interface selection.");
        }
    } 
}
public static void firstScreen() {
    java.lang.System.out.println(("Por favor selecione uma das seguintes op\u00e7\u00f5es:\n" + (("1)\tListar produtos\n" + "2)\tListar prateleiras\n") + "3)	Sair")));
    try (java.util.Scanner scanner = new java.util.Scanner(java.lang.System.in)) {
        java.lang.Integer input = io.altar.jseproject.textinterface.TextInterface.validateOption(1, 3, scanner);
        switch (input) {
            case 1 :
                io.altar.jseproject.textinterface.TextInterface.listProductScreen();
                break;
            case 2 :
                io.altar.jseproject.textinterface.TextInterface.listShelfScreen();
                break;
            case 3 :
                io.altar.jseproject.textinterface.TextInterface.leave();
                break;
        }
    }
}
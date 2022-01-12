public static void listShelfScreen() {
    java.lang.System.out.println(("Por favor selecione uma das seguintes op\u00e7\u00f5es:\n" + (((("1)\tCriar nova prateleira\n" + "2)\tEditar uma prateleira existente\n") + "3)\tConsultar o detalhe de uma prateleira\n") + "4)\tRemover uma prateleira\n") + "5)	Voltar ao ecrã anterior")));
    try (java.util.Scanner scanner = new java.util.Scanner(java.lang.System.in)) {
        java.lang.Integer input = io.altar.jseproject.textinterface.TextInterface.validateOption(1, 5, scanner);
        switch (input) {
            case 1 :
                break;
            case 2 :
                break;
            case 3 :
                break;
            case 4 :
                break;
            case 5 :
                io.altar.jseproject.textinterface.TextInterface.firstScreen();
                break;
        }
    }
}
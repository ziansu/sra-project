@java.lang.Override
public void manageDatabase() {
    while (true) {
        java.lang.System.out.println("Wybierz działanie:");
        java.lang.System.out.println("[0] Wycofaj do głównego menu");
        java.lang.System.out.println("[1] Dodaj konto ucznia");
        java.lang.System.out.println("[2] Dodaj konto nauczyciela");
        java.lang.System.out.println("[2] Dodaj konto nauczyciela");
        int order = scanner.nextInt();
        switch (order) {
            case 0 :
                adminMain();
                break;
            case 1 :
                addUserStudent();
                break;
            case 2 :
                addUserTeacher();
                break;
            default :
                java.lang.System.out.println("Niepoprawne polecenie,\n Wybierz warto\u015b\u0107 z zakresu");
                break;
        }
    } 
}
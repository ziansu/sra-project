public int loginMenuInput() {
    int loginChoice = -1;
    while ((loginChoice < 0) || (loginChoice > 3)) {
        try {
            java.lang.System.out.print(enterSelection);
            loginChoice = java.lang.Integer.parseInt(sc.nextLine());
        } catch (java.lang.NumberFormatException e) {
            java.lang.System.out.println(invalidInput);
        }
    } 
    return loginChoice;
}
public static int getConsoleInt(java.lang.String text, boolean nulltable, int vdefault) {
    boolean valid = false;
    int data = 0;
    while (!valid) {
        java.lang.System.out.print(text);
        try {
            data = java.lang.Integer.parseInt(consoleUI.UtilsUI.reader.nextLine());
        } catch (java.lang.NumberFormatException exception) {
            if (!nulltable) {
                java.lang.System.out.println("Introduce un n�mero entero");
            }else {
                data = vdefault;
            }
        }
        if ((data != 0) || nulltable) {
            valid = true;
        }
    } 
    return data;
}
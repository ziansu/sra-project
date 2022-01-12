public static int readInt(int defaultValue) throws java.io.IOException {
    if (IOClass.IO.debug) {
        return defaultValue;
    }else {
        while (true) {
            try {
                java.lang.String i = IOClass.IO.br.readLine();
                return java.lang.Integer.parseInt(i.trim().replace(',', '.'));
            } catch (java.lang.NumberFormatException e) {
                java.lang.System.out.print("Keine Ganzzahl! Bitte erneut versuchen: ");
            }
        } 
    }
}
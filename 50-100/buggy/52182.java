private static void checkCurrentType(java.lang.String className) {
    if ((!(className.equals(com.acme.edu.Logger.currentType))) || (com.acme.edu.Logger.currentType.equals(""))) {
        if (!(com.acme.edu.Logger.currentType.equals(""))) {
            com.acme.edu.Logger.printAndResetBuffer();
        }
        com.acme.edu.Logger.clearBuffer();
        com.acme.edu.Logger.sequentIntSum = 0;
        com.acme.edu.Logger.sequentByteSum = 0;
        com.acme.edu.Logger.counterStringRepeat = 1;
        com.acme.edu.Logger.sequentStringSum.setLength(0);
        com.acme.edu.Logger.currentType = className;
    }
}
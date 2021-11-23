public static void changeFloat(java.lang.String codeLine) {
    try {
        java.lang.String[] param = main.StringMatcher.getparametters(main.StringMatcher.getBracketsContent(codeLine, 1));
        float value = emulator.content.Variable.getValueOf(param[1]);
        java.lang.System.out.println(value);
        main.Main.getEMU().variables.setvariable(param[0], value);
    } catch (java.lang.Exception e) {
        java.lang.System.err.println("Warning : Unable to set a variable to it's desired value.");
    }
}
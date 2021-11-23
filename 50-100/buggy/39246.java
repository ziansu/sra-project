public static void main(java.lang.String[] args) {
    args = new java.lang.String[]{ "-parent" , "/Users/ft/Lavoro/tmp/sdatests-0.0.11/tests/1806151550-m3.large-800x2/mpl1/home/ubuntu" , "-size" , "m3.large" };
    it.polimi.modaclouds.sdatests.validator.Main m = new it.polimi.modaclouds.sdatests.validator.Main();
    com.beust.jcommander.JCommander jc = new com.beust.jcommander.JCommander(m, args);
    java.lang.System.out.println(it.polimi.modaclouds.sdatests.validator.Main.APP_TITLE);
    if (m.help) {
        jc.usage();
        java.lang.System.exit(0);
    }
    it.polimi.modaclouds.sdatests.validator.Validator.perform(java.nio.file.Paths.get(m.parent), m.size);
}
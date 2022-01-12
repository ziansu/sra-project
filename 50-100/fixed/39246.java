public static void main(java.lang.String[] args) {
    it.polimi.modaclouds.sdatests.validator.Main m = new it.polimi.modaclouds.sdatests.validator.Main();
    com.beust.jcommander.JCommander jc = new com.beust.jcommander.JCommander(m, args);
    java.lang.System.out.println(it.polimi.modaclouds.sdatests.validator.Main.APP_TITLE);
    if (m.help) {
        jc.usage();
        java.lang.System.exit(0);
    }
    it.polimi.modaclouds.sdatests.validator.Validator.perform(java.nio.file.Paths.get(m.parent), m.size);
}
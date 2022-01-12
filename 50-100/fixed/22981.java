public static void main(java.lang.String[] args) {
    int ANZAHL_PARAMETER = 1;
    int PARAMETER_NR_PROPERTY_FILE = 0;
    java.lang.String USAGE = "USAGE: java -jar MusikPlayerGui <pfadDerPropertyDatei>";
    if ((args.length) < ANZAHL_PARAMETER) {
        java.lang.System.err.println(USAGE);
        java.lang.System.exit(musicplayer.gui.MusikPlayerProgramm.EXIT_CODE_USAGE);
    }
    jiconfont.swing.IconFontSwing.register(jiconfont.icons.FontAwesome.getIconFont());
    musicplayer.gui.MusikPlayerProgramm.initJavaFxEnvironment();
    musicplayer.gui.MusikPlayerProgramm gui = new musicplayer.gui.MusikPlayerProgramm();
    gui.start(args[PARAMETER_NR_PROPERTY_FILE]);
}
public static void main(java.lang.String[] args) {
    java.lang.String variant = "ultimate";
    if (((args.length) > 0) && ((args[0]) != null)) {
        variant = args[0];
    }
    config.Config.variant = variant;
    try {
        gui.Gui window = new gui.Gui();
        window.init();
    } catch (java.lang.Exception e) {
        e.printStackTrace();
    }
}
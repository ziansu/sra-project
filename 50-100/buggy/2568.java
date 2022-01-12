public static void main(java.lang.String[] args) {
    EstimatorInterface l;
    if ((args.length) == 2) {
        l = new Localizer(args[0], args[1], 4);
    }else {
        l = new Localizer(8, 8, 4);
    }
    RobotLocalizationViewer viewer = new RobotLocalizationViewer(l);
    new LocalizationDriver(500, viewer).start();
}
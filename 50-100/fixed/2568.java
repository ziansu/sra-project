public static void main(java.lang.String[] args) {
    EstimatorInterface l;
    if ((args.length) == 2) {
        l = new Localizer(java.lang.Integer.parseInt(args[0]), java.lang.Integer.parseInt(args[1]), 4);
    }else {
        l = new Localizer(4, 4, 4);
    }
    RobotLocalizationViewer viewer = new RobotLocalizationViewer(l);
    new LocalizationDriver(500, viewer).start();
}
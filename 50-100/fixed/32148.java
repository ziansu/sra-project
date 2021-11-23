public static void main(java.lang.String[] args) {
    boolean testing = false;
    if ((args.length) == 1) {
        testing = java.lang.Boolean.valueOf(args[0]);
    }
    edu.kit.ipd.crowdcontrol.workerservice.Main main = new edu.kit.ipd.crowdcontrol.workerservice.Main(testing);
    main.boot();
}
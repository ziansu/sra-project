public static void main(java.lang.String[] args) {
    de.huberlin.wbi.hiway.common.Worker worker = new de.huberlin.wbi.hiway.common.Worker();
    try {
        worker.init(args);
        worker.run();
    } catch (org.apache.commons.cli.ParseException | java.io.IOException | org.json.JSONException e) {
        e.printStackTrace();
        java.lang.System.exit((-1));
    }
}
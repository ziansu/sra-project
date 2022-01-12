public void run(java.lang.String[] args) {
    try {
        org.json.JSONObject knxResponse = process(args[1], new tuwien.auto.calimero.GroupAddress((((((args[2]) + ", ") + (args[3])) + ", ") + (args[4]))));
        java.lang.System.out.println(knxResponse.toString(4));
    } catch (tuwien.auto.calimero.exception.KNXFormatException e) {
        e.printStackTrace();
    }
}
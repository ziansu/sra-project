public void run(java.lang.String[] args) {
    org.json.JSONObject knxResponse = process(args[1], new tuwien.auto.calimero.GroupAddress(java.lang.Integer.parseInt(args[2]), java.lang.Integer.parseInt(args[3]), java.lang.Integer.parseInt(args[4])));
    java.lang.System.out.println(knxResponse.toString(4));
}
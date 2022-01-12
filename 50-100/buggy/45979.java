public static void read() {
    org.json.simple.parser.JSONParser parser = new org.json.simple.parser.JSONParser();
    try {
        java.lang.Object obj = parser.parse(new java.io.FileReader("Accounts.json"));
        org.json.simple.JSONObject jsonObject = ((org.json.simple.JSONObject) (obj));
        org.json.simple.JSONArray pwlist = ((org.json.simple.JSONArray) (jsonObject.get("Accounts")));
        java.lang.System.out.println(pwlist);
    } catch (java.lang.Exception e) {
        e.printStackTrace();
    }
    PassManager.menu();
}
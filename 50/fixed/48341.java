private void printObj(JSONObject jObj, java.io.PrintWriter writer) {
    try {
        writer.print(jObj.toString(3));
    } catch (JSONException e) {
        java.lang.System.out.println("could to to string json object");
    }
}
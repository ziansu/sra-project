public static int getWindDir(org.json.JSONObject input) throws org.json.JSONException {
    return java.lang.Integer.parseInt(input.getString("winddirDegree"));
}
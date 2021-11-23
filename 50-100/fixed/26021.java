@java.lang.Override
protected void onPostExecute(java.lang.String result) {
    super.onPostExecute(result);
    try {
        org.json.JSONObject json = new org.json.JSONObject(result);
        if (!(result.isEmpty())) {
            java.lang.String email_inputed = json.get("email").toString();
            java.lang.String password_inputed = password;
        }
    } catch (java.lang.Exception e) {
        e.printStackTrace();
    }
}
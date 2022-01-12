@java.lang.Override
protected void onPostExecute(java.lang.String result) {
    if (result.equals("success")) {
        java.lang.String id = userID;
        redirect(id);
    }else
        if (result.equals("failed")) {
            showAlert("Login fail");
        }else {
            showAlert("Connection problem");
        }
    
    super.onPostExecute(result);
}
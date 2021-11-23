@java.lang.Override
protected void onPostExecute(java.lang.String result) {
    if (result.equals("success")) {
        showAlert(result);
    }else
        if (result.equals("failed")) {
            showAlert("Login fail");
        }else {
            showAlert("Connection problem");
        }
    
    super.onPostExecute(result);
}
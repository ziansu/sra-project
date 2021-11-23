@java.lang.Override
protected void onPostExecute(java.lang.Void aVoid) {
    if (flag[0]) {
        finish();
        android.content.Intent intent = new android.content.Intent(this, com.vladimircvetanov.smartfinance.MainActivity.class);
        startActivity(intent);
        com.vladimircvetanov.smartfinance.message.Message.message(this, ("Successful logged in." + (com.vladimircvetanov.smartfinance.model.Manager.getLoggedUser().getId())));
    }else {
        com.vladimircvetanov.smartfinance.message.Message.message(this, "Wrong email or password.");
    }
}
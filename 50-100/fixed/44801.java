private boolean isEmailExist() {
    usersMap = mPrefs.getAll();
    for (java.util.Map.Entry<java.lang.String, ?> entry : usersMap.entrySet()) {
        userJson = ((java.lang.String) (entry.getValue()));
        user = gson.fromJson(userJson, com.szikora.covid.User.class);
        if (user.getEmail().equals(email.getText().toString())) {
            return true;
        }
    }
    return false;
}
private void redirectToHomePage(java.lang.String login, com.example.mary.hospital.Model.Role role, java.lang.Class activityToRedirect) {
    android.content.Intent IntentTemp = new android.content.Intent(this, activityToRedirect);
    IntentTemp.putExtra(ExtraResource.USER_LOGIN, login);
    IntentTemp.putExtra(ExtraResource.CURRENT_DOCTOR_LOGIN, login);
    IntentTemp.putExtra(ExtraResource.DOCTOR_ID, userService.getUserByLogin(login).getId());
    IntentTemp.putExtra(ExtraResource.USER_ROLE, role.toString());
    startActivity(IntentTemp);
}
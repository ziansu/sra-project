private void attemptRegistration() {
    java.lang.String password = passwordInput.getText().toString();
    java.lang.String passRedo = passwordRedo.getText().toString();
    java.lang.String username = usernameInput.getText().toString();
    java.lang.String name = nameInput.getText().toString();
    com.example.otteramazement.clean_water.ProfileType type = ((com.example.otteramazement.clean_water.ProfileType) (typeSpinner.getSelectedItem()));
    register(password, passRedo, username, name, type, true);
}
private void saveUserPreferences() {
    user.setPreferences(preferences);
    com.hexabinome.saladetomateoignon.PrefUtils.sauvegardeUtilisateur(getContext(), user);
}
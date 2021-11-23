public void isfbLoggedOut() {
    com.google.firebase.auth.FirebaseUser user = mAuth.getCurrentUser();
    if (user == null) {
        tvLoggedInUser.setVisibility(View.GONE);
        btnLogout.setVisibility(View.GONE);
        btnAdvanced.setVisibility(View.GONE);
        cvTeacher.setVisibility(View.GONE);
        cvVPlan.setVisibility(View.GONE);
        btnLogin.setVisibility(View.VISIBLE);
    }
}
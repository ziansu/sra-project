private void changePassword(java.lang.String password, java.lang.String passwordMatch) {
    if (passwordsAreEqual(password, passwordMatch)) {
        try {
            android.widget.Toast.makeText(getContext(), "Your password has been changed.", Toast.LENGTH_SHORT).show();
        } catch (java.lang.Exception e) {
            android.util.Log.e(edu.uwf.tabletopgroup.tabletop_squire.PasswordFragment.TAG, "changePassword: ", e);
            android.widget.Toast.makeText(getActivity(), "Error setting new password!", Toast.LENGTH_LONG).show();
        }
    }
}
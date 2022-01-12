private void checkProfile() {
    final android.widget.TextView editTV = ((android.widget.TextView) (findViewById(R.id.edit_profile_tv)));
    if (!(currentUser.isProfileComplete())) {
        editTV.setText(R.string.incomplete_profile_prompt);
    }else {
        editTV.setText(R.string.you_can_edit_your_profile_anytime);
    }
}
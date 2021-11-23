public void agree(android.view.View view) {
    android.widget.CheckBox checkbox = ((android.widget.CheckBox) (findViewById(R.id.agreeCheckBox)));
    if (checkbox.isChecked()) {
        android.content.Intent intent = new android.content.Intent(this, tau.user.tausurveryapp.RegisterActivity.class);
        startActivity(intent);
    }else {
        android.support.design.widget.Snackbar.make(view, "אנא אשרו את טופס ההסכמה", Snackbar.LENGTH_LONG).show();
    }
}
public void onRadioSelected(android.view.View view) {
    android.widget.RadioGroup options = ((android.widget.RadioGroup) (view.findViewById(R.id.campaign_options)));
    android.widget.RadioButton option = ((android.widget.RadioButton) (view.findViewById(options.getCheckedRadioButtonId())));
    java.lang.String hint = ((java.lang.String) (option.getHint()));
    android.widget.Toast.makeText(getApplicationContext(), ("Value:" + hint), Toast.LENGTH_SHORT).show();
}
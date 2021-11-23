@java.lang.Override
public void onClick(android.view.View v) {
    tenureOptionsMonthly.setTextColor(getResources().getColor(R.color.primary_emi));
    tenureOptionsMonthly.setTextSize(14);
    tenureOptionsYearly.setTextColor(android.graphics.Color.parseColor("#000000"));
    tenureOptionsYearly.setTextSize(10);
    mory = false;
    CalculateAndSet(java.lang.Integer.parseInt(loanInput.getText().toString().trim()), mory, java.lang.Integer.parseInt(tenureInput.getText().toString().trim()));
}
@java.lang.Override
public void onClick(android.view.View v) {
    tenureOptionsYearly.setTextColor(getResources().getColor(R.color.primary_emi));
    tenureOptionsYearly.setTextSize(14);
    tenureOptionsMonthly.setTextColor(android.graphics.Color.parseColor("#000000"));
    tenureOptionsMonthly.setTextSize(10);
    mory = true;
    CalculateAndSet(java.lang.Integer.parseInt(loanInput.getText().toString().trim()), mory, java.lang.Integer.parseInt(tenureInput.getText().toString().trim()));
}
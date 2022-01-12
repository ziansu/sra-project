@java.lang.Override
public void onClick(android.view.View v) {
    if (((weight.getText().toString()) != null) && ((height.getText().toString()) != null)) {
        cal_BMI();
    }
}
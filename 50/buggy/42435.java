@java.lang.Override
public void onClick(android.view.View view) {
    if (enterAmount_editText.getText().toString().equals("")) {
        clear_Button.performClick();
    }else
        calculateBill();
    
}
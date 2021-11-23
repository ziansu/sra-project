public void onClickListenerDelete(android.view.View v) {
    switch (v.getId()) {
        case R.id.buttonBackspace :
            java.lang.String temp3 = textView1.getText().toString();
            if ((temp3.length()) == 0) {
                textView1.setText(temp3.substring(0, ((temp3.length()) - 1)));
            }
            break;
        case R.id.buttonClear :
            textView1.setText("");
            temp1 = floatNull;
            temp2 = floatNull;
            break;
    }
}
@java.lang.Override
public void afterTextChanged(android.text.Editable s) {
    java.lang.System.out.println("Value changed");
    aparato.setNetid(etNetID.getText().toString());
}
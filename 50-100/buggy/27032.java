@java.lang.Override
public void onTextChanged(java.lang.CharSequence s, int start, int before, int count) {
    java.lang.String content = etClassName.getText().toString();
    if ((!(content.equals(""))) && (!(content.equals(classClassName)))) {
        setChanged(true);
    }else {
        setChanged(false);
    }
}
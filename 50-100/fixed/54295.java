@java.lang.Override
public void onPause() {
    super.onPause();
    nt.text = et_body.getText().toString();
    nt.title = et_title.getText().toString();
    et_body.setText("");
    et_title.setText("");
    if (!(nt.text.equals("")))
        nt.save();
    
}
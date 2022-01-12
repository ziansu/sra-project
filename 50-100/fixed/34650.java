@java.lang.Override
public void onCheckedChanged(android.widget.RadioGroup arg0, int arg1) {
    if (arg1 == (R.id.rb_paylease_yes)) {
        et_payleasetaxaccountno.setBackgroundResource(R.drawable.textfiled);
        et_payleasetaxaccountno.setEnabled(true);
    }else
        if (arg1 == (R.id.rb_paylease_no)) {
            et_payleasetaxaccountno.setEnabled(false);
        }
    
}
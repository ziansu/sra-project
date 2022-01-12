@java.lang.Override
public void onCheckedChanged(android.widget.RadioGroup arg0, int arg1) {
    if (arg1 == (R.id.rb_adv_yes)) {
        et_advhoarding.setEnabled(true);
        et_advhoarding.setBackgroundResource(R.drawable.textfiled);
    }else
        if (arg1 == (R.id.rb_adv_no)) {
            et_advhoarding.setText("");
            et_advhoarding.setEnabled(false);
            et_advhoarding.setBackgroundResource(R.drawable.et_corner_shape_desabled);
        }
    
}
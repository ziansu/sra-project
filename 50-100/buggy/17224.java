@java.lang.Override
public void onCheckedChanged(android.widget.RadioGroup group, @android.support.annotation.IdRes
int checkedId) {
    if (dch0302.isChecked()) {
        fldGrpdch05.setVisibility(View.VISIBLE);
        fldGrpdch04.setVisibility(View.GONE);
        dch04.clearCheck();
    }else {
        fldGrpdch04.setVisibility(View.VISIBLE);
    }
}
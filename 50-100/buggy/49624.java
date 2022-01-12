@java.lang.Override
public void onCheckedChanged(android.widget.RadioGroup radioGroup, @android.support.annotation.IdRes
int i) {
    if (thb24a.isChecked()) {
        fldGrpth25.setVisibility(View.VISIBLE);
    }else {
        thb25a.setChecked(false);
        thb25b.setChecked(false);
        thb25c.setChecked(false);
        thb25d.setChecked(false);
        thb25e.setChecked(false);
        thb25f.setChecked(false);
        thb25g.setChecked(false);
        fldGrpth25.setVisibility(View.GONE);
    }
}
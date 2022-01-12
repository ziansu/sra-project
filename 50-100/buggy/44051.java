@java.lang.Override
public void onClick(android.view.View widget) {
    if (checked)
        getText().insert(start, getCheckboxSpannable());
    else
        getText().insert(start, getCheckboxCheckedSpannable());
    
    getText().delete((start + 4), (start + 8));
    getText().removeSpan(this);
    setupCheckboxClickable(start, end, (!checked));
}
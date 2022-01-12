@java.lang.Override
public void onClick(android.view.View widget) {
    getText().removeSpan(this);
    if (checked)
        getText().replace(start, (start + 4), getCheckboxSpannable());
    else
        getText().replace(start, (start + 4), getCheckboxCheckedSpannable());
    
    setupCheckboxClickable(start, end, (!checked));
}
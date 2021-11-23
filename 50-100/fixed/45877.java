@java.lang.Override
public void onClick(android.view.View v) {
    v.setOnClickListener(null);
    java.lang.String num = ev.getText().toString();
    if (!("".equals(num)))
        setText(inIntTermsOfAny(java.lang.Math.pow(currentValue, parseDouble(num))), ev);
    
    v.setVisibility(View.GONE);
}
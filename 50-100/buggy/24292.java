public void resetRoom4(java.lang.String name, java.lang.String crt, java.lang.String all, java.lang.String lock) {
    name4.setText(name);
    crt4.setText(crt);
    all4.setText(all);
    if (lock == "on")
        lock4.setVisibility(View.VISIBLE);
    else
        lock4.setVisibility(View.INVISIBLE);
    
}
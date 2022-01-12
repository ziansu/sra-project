public void onClickEqual(android.view.View v) {
    if (display.isEmpty())
        return ;
    
    if (!(getResult()))
        return ;
    
    screen.setText((((display) + "\n") + (java.lang.String.valueOf(result))));
}
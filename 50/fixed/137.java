public void oneone(android.view.View v) {
    if ((counter) > 1)
        (counter)--;
    
    android.widget.Toast.makeText(con, ("Counted" + (counter)), Toast.LENGTH_LONG).show();
}
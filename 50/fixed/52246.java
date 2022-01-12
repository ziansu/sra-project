@java.lang.Override
public void onClick(android.content.DialogInterface dialog, int which) {
    setContentView(com.example.tombarrett.estimotemirror.R.layout.activity_main);
    setButtons();
    if ((tempProduct) != null)
        pickup(tempProduct, false);
    
}
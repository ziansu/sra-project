@java.lang.Override
public void onClick(android.view.View view) {
    if (view == (button17)) {
        android.content.Intent Hilfe = new android.content.Intent(this, de.meetme.help.class);
        startActivity(Hilfe);
    }
    if (view == (button8)) {
        createevent();
        android.content.Intent regisintent = new android.content.Intent(this, de.meetme.eventinfos.class);
        startActivity(regisintent);
    }
}
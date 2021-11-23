@java.lang.Override
public boolean onCreateOptionsMenu(android.view.Menu menu) {
    getMenuInflater().inflate(R.menu.menu_photo_album, menu);
    android.view.MenuItem item = menu.findItem(R.id.action_ok);
    java.lang.System.out.println(("okButtonDrawable :::: " + (okButtonDrawable)));
    if ((okButtonDrawable) != null) {
        item.setIcon(okButtonDrawable);
    }else
        if ((menuText) != null) {
            item.setIcon(new com.sangcomz.fishbun.util.TextDrawable(getResources(), menuText, colorMenuText));
        }
    
    return true;
}
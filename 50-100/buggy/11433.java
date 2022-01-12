@java.lang.Override
public boolean onOptionsItemSelected(android.view.MenuItem item) {
    switch (item.getItemId()) {
        case R.id.variantIos :
            com.vanniktech.emoji.EmojiManager.install(new com.vanniktech.emoji.ios.IosEmojiProvider());
            recreate();
            return true;
        case R.id.variantEmojiOne :
            com.vanniktech.emoji.EmojiManager.install(new com.vanniktech.emoji.one.EmojiOneProvider());
            recreate();
            return true;
    }
    return super.onOptionsItemSelected(item);
}
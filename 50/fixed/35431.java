@java.lang.Override
public boolean onLongClick(android.view.View v) {
    if (me.ccrama.redditslide.SettingValues.swap) {
        doOnClick(holder, comment, baseNode);
    }else {
        doLongClick(holder, comment, baseNode);
    }
    return true;
}
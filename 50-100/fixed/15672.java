@java.lang.Override
public boolean onLongClick(android.view.View v) {
    if (!(currentlyEditingId.equals(comment.getFullName())))
        if (me.ccrama.redditslide.SettingValues.swap) {
            doOnClick(holder, comment, baseNode);
        }else {
            doLongClick(holder, comment, baseNode);
        }
    
    return true;
}
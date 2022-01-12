@java.lang.Override
public void onSingleClick(android.view.View v) {
    if (!(currentlyEditingId.equals(comment.getFullName())))
        if (me.ccrama.redditslide.SettingValues.swap) {
            doLongClick(holder, comment, baseNode);
        }else {
            doOnClick(holder, comment, baseNode);
        }
    
}
@java.lang.Override
public void onSingleClick(android.view.View v) {
    me.ccrama.redditslide.SpoilerRobotoTextView SpoilerRobotoTextView = ((me.ccrama.redditslide.SpoilerRobotoTextView) (v));
    if (me.ccrama.redditslide.SettingValues.swap) {
        doLongClick(holder, comment, baseNode, finalPos, finalPos1);
    }else
        if (!(SpoilerRobotoTextView.isSpoilerClicked())) {
            doOnClick(holder, comment, baseNode);
        }else
            if (SpoilerRobotoTextView.isSpoilerClicked()) {
                SpoilerRobotoTextView.resetSpoilerClicked();
            }
        
    
}
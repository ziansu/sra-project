@java.lang.Override
public void onClick(android.view.View v) {
    if (baseSub != null) {
        me.ccrama.redditslide.OfflineSubreddit.getSubreddit(baseSub).unhideLast();
    }
    posts.add(pos, t);
    recyclerview.getAdapter().notifyItemInserted(pos);
    me.ccrama.redditslide.Hidden.undoHidden(((net.dean.jraw.models.Contribution) (t)));
}
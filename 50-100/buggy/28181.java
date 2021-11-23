public void doOnClick(me.ccrama.redditslide.Adapters.CommentViewHolder holder, net.dean.jraw.models.Comment comment, net.dean.jraw.models.CommentNode baseNode) {
    if (currentSelectedItem.contains(comment.getFullName())) {
        if (me.ccrama.redditslide.SettingValues.swap) {
            doOnClick(holder, baseNode, comment);
        }
        doUnHighlighted(holder, comment, baseNode);
    }else {
        doOnClick(holder, baseNode, comment);
    }
}
@java.lang.Override
public void onSuccess(net.dean.jraw.models.CommentNode comment) {
    view.addComment(comment, (position + 1));
}
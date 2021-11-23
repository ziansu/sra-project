@java.lang.Override
public void onTaskDone() {
    rafraichitListeCommentaire();
    ((android.support.v7.app.ActionBarActivity) (getActivity())).setSupportProgressBarIndeterminateVisibility(false);
}
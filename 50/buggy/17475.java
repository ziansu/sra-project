@java.lang.Override
public void onClick(android.view.View v) {
    feedbackManager.giveLikeToThreadFeedback(currThreadFeedback, pos);
    android.util.Log.d("data log", ("pos: " + pos));
}
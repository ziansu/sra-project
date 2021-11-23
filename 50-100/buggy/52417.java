@java.lang.Override
public void run() {
    java.lang.String userId = likeChecked.get(0).toString();
    if (userId.equals(user)) {
        like.setClickable(false);
        like.setEnabled(false);
        like.setImageResource(R.drawable.like_check);
        dislike.setImageResource(R.drawable.dislike);
    }
}
@java.lang.Override
public void onClick(android.view.View view) {
    android.content.SharedPreferences.Editor editor = sharedpreferences.edit();
    editor.putString(joke.getId(), "disliked");
    editor.commit();
    dislikeButton.setEnabled(false);
    dislikeButton.setBackgroundTintList(android.content.res.ColorStateList.valueOf(android.graphics.Color.parseColor("#E53935")));
    com.cordova.jokerapp.util.RequestBuilder.requestUpdateLike(getBaseContext(), ((com.cordova.jokerapp.util.RequestBuilder.URL_JOKE_DISLIKE) + (joke.getId())));
}
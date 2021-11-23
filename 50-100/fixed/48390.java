@java.lang.Override
public void onComplete(com.firebase.client.FirebaseError firebaseError, com.firebase.client.Firebase firebase) {
    android.util.Log.v("CustomTileAdapter", "inNotLike");
    myFirebase.setDislike(user, object.name);
    android.content.Context context = parent.getContext();
    java.lang.CharSequence text = "Disliked : " + (object.name);
    buttonDown.setImageResource(R.drawable.ic_thumbs_down_tile_selected);
    int duration = android.widget.Toast.LENGTH_SHORT;
    android.widget.Toast toast = android.widget.Toast.makeText(context, text, duration);
    toast.show();
    recommendationList.remove(position);
    notifyDataSetChanged();
}
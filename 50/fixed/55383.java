@java.lang.Override
public void onHasLiked(java.lang.Boolean bool) {
    if ((bool != null) && bool)
        like.setText(getResources().getString(R.string.unlike));
    else
        like.setText(getResources().getString(R.string.like));
    
}
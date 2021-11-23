@java.lang.Override
protected void onPostExecute(android.graphics.drawable.Drawable result) {
    android.widget.ImageView v = v_.get();
    if ((v != null) && ((v.getTag()) == (this))) {
        v.setTag(null);
        v.setImageDrawable(result);
    }
}
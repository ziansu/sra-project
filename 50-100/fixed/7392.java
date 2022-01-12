@java.lang.Override
public void done(com.parse.ParseException e) {
    if (e == null) {
        mOriginal.remove(getItems().get(position));
        getItems().remove(position);
        getBaseAdapter().notifyItemRemoved(position);
        android.widget.Toast.makeText(getContext(), "Sent request!", Toast.LENGTH_LONG).show();
    }else {
        android.widget.Toast.makeText(getContext(), e.getMessage(), Toast.LENGTH_LONG).show();
    }
}
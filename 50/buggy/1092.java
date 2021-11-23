@java.lang.Override
public void onItemPosted() {
    android.widget.Toast.makeText(this.getContext(), "You event has been created!", Toast.LENGTH_LONG).show();
    this.dismiss();
}
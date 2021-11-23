@java.lang.Override
public android.content.Loader<java.util.ArrayList<com.example.android.myquake.word>> onCreateLoader(int id, android.os.Bundle args) {
    text = ((android.widget.TextView) (findViewById(R.id.texto)));
    if (isOnline()) {
        return new com.example.android.myquake.Arrayloader(this);
    }else {
        text.setText("No internet Connection");
        text.setVisibility(View.VISIBLE);
        android.view.View x = ((android.view.View) (findViewById(R.id.loadingtext)));
        x.setVisibility(View.GONE);
        return null;
    }
}
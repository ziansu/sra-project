@java.lang.Override
public boolean onOptionsItemSelected(android.view.MenuItem item) {
    switch (item.getItemId()) {
        case R.id.action_search :
            android.util.Log.d("Click", "Hua re baab");
            android.content.Intent i = new android.content.Intent(getContext(), sodevan.lafly.addNewEvent.class);
            startActivity(i);
    }
    return true;
}
@java.lang.Override
public void onItemClick(android.widget.AdapterView<?> adapterView, android.view.View view, int position, long l) {
    java.lang.String dogName = mMatchesAdapter.getName(position);
    android.widget.Toast.makeText(getActivity(), dogName, Toast.LENGTH_SHORT).show();
    com.firebase.petti.db.classes.User selected = mMatchesAdapter.getItem(position);
    android.content.Intent intent = new android.content.Intent(getActivity(), com.firebase.petti.petti.MatchedDogActivity.class);
    intent.putExtra("user", selected);
    startActivity(intent);
}
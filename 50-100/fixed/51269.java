@java.lang.Override
public void onItemClick(android.widget.AdapterView<?> adapterView, android.view.View view, int position, long l) {
    com.firebase.petti.db.classes.User selected = mMatchesAdapter.getItem(position);
    android.content.Intent intent = new android.content.Intent(getActivity(), com.firebase.petti.petti.MatchedDogActivity.class);
    intent.putExtra("user", selected);
    startActivity(intent);
}
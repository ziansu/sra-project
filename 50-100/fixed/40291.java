@java.lang.Override
public void onDataChange(com.google.firebase.database.DataSnapshot dataSnapshot) {
    jokes.clear();
    java.lang.Iterable<com.google.firebase.database.DataSnapshot> children = dataSnapshot.getChildren();
    for (com.google.firebase.database.DataSnapshot child : children) {
        com.example.sjors.sjors_witteveen_pset6.Joke joke = new com.example.sjors.sjors_witteveen_pset6.Joke(child.getKey(), ((java.lang.String) (child.getValue())));
        jokes.add(joke);
    }
    sortJokesAlphabetically();
    adapter.notifyDataSetChanged();
}
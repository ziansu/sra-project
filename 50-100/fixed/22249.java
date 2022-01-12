@java.lang.Override
public void onChildRemoved(com.google.firebase.database.DataSnapshot dataSnapshot) {
    android.util.Log.d(blackjack92.todomanager.adapter.TodoAdapter.TAG, ("onChildRemoved:" + (dataSnapshot.getKey())));
    blackjack92.todomanager.domain.Todo todo = dataSnapshot.getValue(blackjack92.todomanager.domain.Todo.class);
    int position = removeTodo(todo);
    notifyItemRemoved(position);
}
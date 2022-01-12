@java.lang.Override
public void onChildChanged(com.google.firebase.database.DataSnapshot dataSnapshot, java.lang.String previousChildName) {
    android.util.Log.d(blackjack92.todomanager.adapter.TodoAdapter.TAG, ("onChildChanged:" + (dataSnapshot.getKey())));
    blackjack92.todomanager.domain.Todo todo = dataSnapshot.getValue(blackjack92.todomanager.domain.Todo.class);
    int position = todoManager.replaceTodo(todo);
    notifyItemChanged(position);
}
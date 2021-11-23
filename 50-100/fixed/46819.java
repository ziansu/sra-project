@java.lang.Override
public void onItemClick(android.widget.AdapterView<?> parent, android.view.View view, int position, long id) {
    com.polito.mad17.madmax.entities.User item = addedAdapter.getItem(position).getValue();
    com.polito.mad17.madmax.activities.users.NewMemberActivity.alreadySelected.remove(item.getID());
    addedAdapter.update(com.polito.mad17.madmax.activities.users.NewMemberActivity.alreadySelected);
    addedAdapter.notifyDataSetChanged();
    friends.put(item.getID(), item);
    friendsAdapter.update(friends);
    friendsAdapter.notifyDataSetChanged();
}
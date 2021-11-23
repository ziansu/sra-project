@java.lang.Override
public void onItemClick(android.widget.AdapterView<?> parent, android.view.View view, int position, long id) {
    com.polito.mad17.madmax.entities.User item = friendsAdapter.getItem(position).getValue();
    friends.remove(item.getID());
    friendsAdapter.update(friends);
    friendsAdapter.notifyDataSetChanged();
    com.polito.mad17.madmax.activities.users.NewMemberActivity.alreadySelected.put(item.getID(), item);
    addedAdapter.update(com.polito.mad17.madmax.activities.users.NewMemberActivity.alreadySelected);
    addedAdapter.notifyDataSetChanged();
}
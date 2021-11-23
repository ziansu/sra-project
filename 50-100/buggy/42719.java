public boolean onMenuItemClick(android.view.MenuItem item) {
    if ((item.getItemId()) == (convertView.findViewById(R.id.action_course_remove))) {
        deleteObject(groupPosition);
    }
    android.widget.Toast.makeText(v.getContext(), ("You Clicked : " + (item.getTitle())), Toast.LENGTH_SHORT).show();
    return true;
}
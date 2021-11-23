public void staffMemberSelected(com.parse.ParseUser user) {
    android.content.Intent modifyUserIntent = new android.content.Intent(getApplicationContext(), com.example.adam.quickroster.EditStaffMemeberActivity.class);
    modifyUserIntent.putExtra("username", user.getUsername());
    modifyUserIntent.putExtra("firstName", user.getString("firstName"));
    modifyUserIntent.putExtra("lastName", user.getString("lastName"));
    modifyUserIntent.putExtra("email", user.getEmail());
    modifyUserIntent.putExtra("staffID", user.getObjectId());
    startActivity(modifyUserIntent);
}
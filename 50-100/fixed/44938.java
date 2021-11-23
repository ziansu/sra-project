@java.lang.Override
public void onClick(android.view.View view) {
    android.content.Intent intent = new android.content.Intent(context, com.codepath.finalproject.ProfileActivity.class);
    com.codepath.finalproject.User user = new com.codepath.finalproject.User();
    user.setName(name);
    user.setNumber(number);
    intent.putExtra("user", user);
    context.startActivity(intent);
}
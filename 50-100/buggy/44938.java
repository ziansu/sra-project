@java.lang.Override
public void onClick(android.view.View view) {
    android.util.Log.i("adapter name", name);
    android.content.Intent intent = new android.content.Intent(context, com.codepath.finalproject.ProfileActivity.class);
    com.codepath.finalproject.User user = new com.codepath.finalproject.User();
    user.setName(name);
    user.setNumber(number);
    android.util.Log.i("adapter number", user.getNumber());
    intent.putExtra("user", user);
    context.startActivity(intent);
}
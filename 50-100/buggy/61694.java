@java.lang.Override
public void onClick(android.view.View v) {
    holder.imageViewFollowed.setImageResource(R.drawable.followed);
    if (com.wewow.UserInfo.isUserLogged(context)) {
        postReadToServer(stringObjectHashMap.get("id").toString());
    }else {
        android.content.Intent i = new android.content.Intent();
        i.setClass(context, com.wewow.LoginActivity.class);
        context.startActivity(i);
    }
}
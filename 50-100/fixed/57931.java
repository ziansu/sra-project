@java.lang.Override
public void onClick(android.view.View v) {
    if (com.wewow.UserInfo.isUserLogged(context)) {
        id = stringObjectHashMap.get("id").toString();
        postReadToServer(id);
        holder.imageViewFollowed.setImageResource(R.drawable.followed);
    }else {
        android.content.Intent i = new android.content.Intent();
        i.setClass(context, com.wewow.LoginActivity.class);
        context.startActivity(i);
    }
}
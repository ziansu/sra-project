@java.lang.Override
public void dealWithCustomAction(android.content.Context context, com.umeng.message.entity.UMessage msg) {
    android.widget.Toast.makeText(context, msg.custom, Toast.LENGTH_LONG).show();
}
@java.lang.Override
public void onClick(android.view.View v) {
    android.content.Intent i = new android.content.Intent(v.getContext(), com.yask.android.photorocket.NewEventActivity.class);
    startActivity(i);
}
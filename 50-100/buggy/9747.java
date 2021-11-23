@java.lang.Override
public void onClick(android.view.View v) {
    if (!(mainActivity.isWorking())) {
        android.widget.Toast.makeText(mainActivity, "请先开启服务", Toast.LENGTH_SHORT).show();
        return ;
    }
    android.content.Intent intent = new android.content.Intent(getContext(), com.crossbow.app.x_timer.app_list.AddAppActivity.class);
    android.os.Bundle bundle = new android.os.Bundle();
    bundle.putStringArrayList("selected", getSelectedApps());
    java.lang.System.out.println(getSelectedApps());
    intent.putExtras(bundle);
    startActivity(intent);
}
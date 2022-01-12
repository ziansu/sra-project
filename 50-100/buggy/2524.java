@java.lang.Override
public void onClick(android.view.View v) {
    android.content.Intent explicitIntent = new android.content.Intent(getApplicationContext(), com.example.bosanac.ljubica.tasky.NewTask.class);
    switch (v.getId()) {
        case R.id.bAddTask :
            explicitIntent.putExtra(com.example.bosanac.ljubica.tasky.MainActivity.KEY, "task");
            break;
    }
    this.startActivity(explicitIntent);
}
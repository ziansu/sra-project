@java.lang.Override
public void onClick(android.view.View v) {
    com.example.atomhacks.Main.setLogin(true);
    android.content.Intent projectList = new android.content.Intent(this, com.example.atomhacks.Main.class);
    startActivity(projectList);
}
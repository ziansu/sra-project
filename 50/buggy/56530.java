@java.lang.Override
public void onClick(android.view.View v) {
    startActivity(new android.content.Intent(this, tda367.myapplication.controller.ActivityInfo.class));
    learnJava.setCurrentLevel(getLevelId(v));
    java.lang.System.out.println((" " + (getLevelId(v))));
}
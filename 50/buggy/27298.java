@java.lang.Override
public void onClick(android.view.View v) {
    try {
        java.lang.reflect.Method method = act.getClass().getMethod(clickStr);
        method.invoke(act);
    } catch (java.lang.Exception e) {
        e.printStackTrace();
    }
}
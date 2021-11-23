@java.lang.Override
public void mousePressed(java.awt.event.MouseEvent e) {
    try {
        method.invoke(this);
    } catch (java.lang.IllegalAccessException | java.lang.reflect.InvocationTargetException ex) {
        ex.printStackTrace();
    }
}
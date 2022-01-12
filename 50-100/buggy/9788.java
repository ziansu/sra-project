public final void setMaximized(boolean maximized) {
    if (isMaximizable()) {
        java.lang.System.out.println("is maximizable");
    }
    if (((isMaximizable()) && (!(isMaximized()))) && maximized) {
        fireMaximizeEvent();
        maximizedProperty.set(true);
    }else
        if ((!maximized) && (isMaximized())) {
            fireRestoreEvent();
            maximizedProperty.set(false);
        }
    
}
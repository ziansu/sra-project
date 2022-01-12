@java.lang.Override
public void saveTask(java.lang.String title, java.lang.String description, android.graphics.Bitmap image) {
    if (isNewTask()) {
        createTask(title, description, image);
    }else {
        updateTask(title, description, image);
    }
}
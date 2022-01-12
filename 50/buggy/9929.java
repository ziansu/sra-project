public void push(com.badlogic.gdx.files.FileHandle file) {
    if ((index) != (history.size))
        history.truncate(index);
    
    history.add(file);
}
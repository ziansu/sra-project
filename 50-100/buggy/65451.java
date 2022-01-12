@java.lang.Override
public void onResume() {
    if (((adapter) == null) | ((parentPath) == null))
        return ;
    
    super.onResume();
    try {
        getDir(parentPath);
        edit.setEnabled(false);
        select.setText(R.string.select_all);
    } catch (java.io.IOException | com.example.admin.mp3tagger.mp3agic.InvalidDataException | com.example.admin.mp3tagger.mp3agic.UnsupportedTagException e) {
        e.printStackTrace();
    }
}
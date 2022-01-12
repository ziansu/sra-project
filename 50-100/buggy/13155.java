@java.lang.Override
public boolean accept(java.io.File f) {
    if (f.isDirectory()) {
        return true;
    }
    final java.lang.String extension = musicjungle.data.Utils.getFileExtension(f);
    if (extension != null) {
        return (extension.equals("mp3")) || (extension.equals("wav"));
    }else
        return false;
    
}
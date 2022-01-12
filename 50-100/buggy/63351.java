@android.support.annotation.NonNull
public java.util.List<jp.blanktar.ruumusic.util.RuuDirectory> getDirectoriesRecursive() {
    java.util.ArrayList<jp.blanktar.ruumusic.util.RuuDirectory> list = new java.util.ArrayList<>();
    java.util.List<jp.blanktar.ruumusic.util.RuuDirectory> dirs = getDirectories();
    for (jp.blanktar.ruumusic.util.RuuDirectory dir : dirs) {
        list.addAll(dir.getDirectories());
    }
    list.addAll(dirs);
    return list;
}
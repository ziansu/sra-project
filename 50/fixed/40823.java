@java.lang.Override
public boolean onDeleteClicked(int id, br.com.carlosrafaelgn.fplay.list.FileSt file) {
    br.com.carlosrafaelgn.fplay.list.SongList.delete(file);
    return true;
}
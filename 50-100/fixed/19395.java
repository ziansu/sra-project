@java.lang.Override
public boolean onMenuItemClick(int position, com.baoyz.swipemenulistview.SwipeMenu menu, int index) {
    net.zarski.myremote.core.ButtonRow row = adapter.getItem(position);
    switch (index) {
        case 0 :
            this.remove(row);
            adapter.remove(row);
            adapter.notifyDataSetChanged();
            try {
                remoteStorage.save(remote);
            } catch (java.io.IOException e) {
                e.printStackTrace();
            }
            break;
    }
    return true;
}
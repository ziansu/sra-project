@android.support.annotation.Nullable
public final M getSelectedItem() {
    if ((selectedItems.size()) > 0) {
        return dataList.get(0);
    }
    return null;
}
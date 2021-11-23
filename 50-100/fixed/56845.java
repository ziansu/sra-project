@java.lang.Override
public boolean removeItem(master.flame.danmaku.danmaku.model.BaseDanmaku item) {
    if (item == null) {
        return false;
    }
    if (item.isOutside()) {
        item.setVisibility(false);
    }
    if (items.remove(item)) {
        (mSize)--;
        return true;
    }
    return false;
}
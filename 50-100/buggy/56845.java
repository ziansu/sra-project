@java.lang.Override
public void removeItem(master.flame.danmaku.danmaku.model.BaseDanmaku item) {
    if (item == null) {
        return ;
    }
    if (item.isOutside()) {
        item.setVisibility(false);
    }
    if (items.remove(item))
        (mSize)--;
    
}
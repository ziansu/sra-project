@java.lang.Override
public boolean onDestroy(com.narrowtux.showcase.ShowcasePlayer player) {
    com.narrowtux.showcase.ShowcasePlayer owner = com.narrowtux.showcase.ShowcasePlayer.getPlayer(item.getPlayer());
    owner.addItems(item.getMaterial(), item.getData(), itemAmount);
    return true;
}
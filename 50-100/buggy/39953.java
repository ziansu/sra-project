@java.lang.Override
public void setInventorySlotContents(int index, @javax.annotation.Nullable
net.minecraft.item.ItemStack stack) {
    contents.set(index, stack);
    if ((stack.getCount()) > (getInventoryStackLimit())) {
        stack.setCount(getInventoryStackLimit());
    }
    if (index == (currentlyPlaying))
        togglePause(true);
    
    markDirty();
}
public boolean removeItem(com.mojang.ld22.item.Item i) {
    com.mojang.ld22.item.ResourceItem ri = findItem(i);
    if (ri == null)
        return false;
    else
        items.remove(ri);
    
    return true;
}
public boolean add(net.launcher.game.nbt.NBT base) {
    if ((base.getType()) == (NBTType.NULL))
        return false;
    
    if (validate(base))
        if (list.add(base))
            return true;
        
    
    return false;
}
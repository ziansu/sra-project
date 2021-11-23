private static fi.dy.masa.enderutilities.util.SlotRange getSlotRangeForSection(int section) {
    if (section == 0) {
        return new fi.dy.masa.enderutilities.util.SlotRange(0, 27);
    }else
        if (section == 1) {
            return new fi.dy.masa.enderutilities.util.SlotRange(27, 14);
        }
    
    return new fi.dy.masa.enderutilities.util.SlotRange(41, 14);
}
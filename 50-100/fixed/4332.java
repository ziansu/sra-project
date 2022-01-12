public static FreeSpace FindFreeSpace(int jobSize) {
    for (int i = 0, l = Swapper.freeSpaceTable.size(); i < l; i++) {
        if ((Swapper.freeSpaceTable.get(i).size) >= jobSize) {
            return Swapper.freeSpaceTable.get(i);
        }
    }
    return null;
}
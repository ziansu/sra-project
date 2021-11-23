public static void addToMemory(java.lang.String toMemory) {
    Memory.memory.add(toMemory);
    if ((Memory.memory.size()) == 3) {
        Memory.memory.remove(2);
    }
}
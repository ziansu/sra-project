public boolean isPlayerOnFence(int[] position) {
    if ((field[position[0]][position[1]]) instanceof hivolts.Fence) {
        return true;
    }
    java.lang.System.out.println("notfence");
    return false;
}
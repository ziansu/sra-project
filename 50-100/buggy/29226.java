public static boolean checkCollision(int index1, int index2) {
    int[] check = new int[2];
    SimulationThread.mapIndecies(index1, index2, check);
    if (SimulationThread._collisionMap.containsKey(check)) {
        SimulationThread._collisionMap.remove(check);
        return true;
    }else
        return false;
    
}
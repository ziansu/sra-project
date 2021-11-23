public static boolean hasReceive(int[][] timeTable, int id, int eventNode, int eventTime) {
    return (timeTable[id][eventNode]) >= eventTime;
}
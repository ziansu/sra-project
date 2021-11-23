public int getUniqueSnakeID() {
    int id = -1;
    boolean hasMatch = true;
    while (hasMatch) {
        id++;
        hasMatch = false;
        for (ClientBridge c : clients) {
            if ((c.getSnake().getId()) == id) {
                hasMatch = true;
                break;
            }
        }
    } 
    return id;
}
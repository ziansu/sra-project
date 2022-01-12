public int getUniqueSnakeID() {
    int id = -1;
    boolean hasMatch = false;
    do {
        id++;
        for (ClientBridge c : clients) {
            if ((c.getSnake().getId()) == id)
                hasMatch = true;
            
        }
    } while (hasMatch );
    return id;
}
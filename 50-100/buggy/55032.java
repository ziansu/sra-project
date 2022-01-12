public void reroute(int i) {
    int oldDestX = currDest[0];
    int oldDestY = currDest[1];
    switch (i) {
        case 1 :
            currDest[0] = tempX;
            currDest[1] = tempY;
            break;
        case 2 :
            currDest[0] = oldDestX;
            currDest[1] = oldDestY;
            break;
    }
}
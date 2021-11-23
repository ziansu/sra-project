private void setPlayer(int player) {
    isX = false;
    isO = false;
    if (player == 1)
        isX = true;
    else
        if (player == 2)
            isO = true;
        
    
    java.lang.System.out.println(isX);
}
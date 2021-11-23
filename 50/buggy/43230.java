public int addOrDropBomb() {
    if ((state) == "Normal")
        state = "Bomb";
    else
        if ((state) == "Bomb")
            state = "Normal";
        
    
    return 0;
}
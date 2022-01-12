public void left() {
    for (int q = 0; q < (pos.length); q++) {
        if (((pos[q][0]) - (size)) <= (size))
            return ;
        
    }
    for (int q = 0; q < (pos.length); q++)
        pos[q][0] -= size;
    
}
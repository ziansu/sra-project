public void left() {
    for (int q = 0; q < (pos.length); q++) {
        if (((pos[q][0]) - (size)) >= (size))
            pos[q][0] -= size;
        
    }
}
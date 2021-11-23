public void right(int dim) {
    for (int q = 0; q < (pos.length); q++) {
        if (((pos[q][0]) + (size)) >= dim)
            return ;
        
    }
    for (int q = 0; q < (pos.length); q++)
        pos[q][0] += size;
    
}
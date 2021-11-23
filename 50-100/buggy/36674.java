public void right(int dim) {
    for (int q = 0; q < (pos.length); q++) {
        if (((pos[q][0]) + (size)) < dim)
            pos[q][0] += size;
        
    }
}
private void cloneWeight() {
    for (int i = 1; i <= (nvertices); i++)
        for (int j = 1; j <= (nvertices); j++)
            weight[i][j] = m[i][j];
        
    
}
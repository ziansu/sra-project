int solve() {
    int count = 0;
    for (int i = 0; i < (field.length); i++)
        for (int j = 0; j < (field[0].length); j++)
            if (field[i][j]) {
                count++;
                dfs(i, j);
            }
        
    
    return count;
}
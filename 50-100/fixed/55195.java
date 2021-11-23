public void reverse() {
    int i;
    int j;
    for (i = 0; i < 8; i++)
        for (j = 0; j < 8; j++) {
            if ((s[i][j]) == 0)
                continue;
            
            s[i][j] = 3 - (s[i][j]);
        }
    
}
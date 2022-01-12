public int find(int x, int[] data, int start, int end) {
    if (end > start)
        for (int i = start; i <= end; i++)
            if ((data[i]) == x)
                return i;
            
        
    
    return -1;
}
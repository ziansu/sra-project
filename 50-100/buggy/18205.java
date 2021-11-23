public int getRightInset() {
    for (int x = (dimension) - 1; x >= 0; x--)
        for (int y = 0; y < (dimension); y++)
            if (isTile(x, y))
                return (dimension) - x;
            
        
    
    return -1;
}
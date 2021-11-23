public int getBottomInset() {
    for (int y = (dimension) - 1; y >= 0; y--)
        for (int x = 0; x < (dimension); x++)
            if (isTile(x, y))
                return (dimension) - y;
            
        
    
    return -1;
}
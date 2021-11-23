protected int b(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    int i = a(4);
    if (i == 0)
        return paramInt1;
    
    if (i == 1)
        return paramInt2;
    
    if (i == 2)
        return paramInt3;
    
    return paramInt4;
}
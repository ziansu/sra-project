public int[][] getBuffer() {
    int[][] out = new int[_buffer.length][_buffer[0].length];
    for (int i = 0; i < (_buffer.length); i++)
        for (int j = 0; j < (_buffer[0].length); j++)
            out[i][j] = _buffer[i][j];
        
    
    return out;
}
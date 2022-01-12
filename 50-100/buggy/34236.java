private edu.princeton.cs.algs4.Picture create_picture() {
    edu.princeton.cs.algs4.Picture result = new edu.princeton.cs.algs4.Picture(_width, _height);
    for (int y = 0; y < (_height); y++)
        for (int x = 0; x < (_width); x++)
            result.set(x, y, _pixels[y][x]);
        
    
    return result;
}
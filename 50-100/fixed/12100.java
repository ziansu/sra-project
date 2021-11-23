public domain.Coordenada getEsquerra(int color) throws java.lang.Exception {
    int x = (this.x) + 1;
    int y;
    if (color == 0)
        y = (this.y) + 1;
    else
        y = (this.y) - 1;
    
    return new domain.Coordenada(x, y);
}
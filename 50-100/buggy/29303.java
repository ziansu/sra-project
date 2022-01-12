@java.lang.Override
public services.IRoute getRouteAt(int x, int y, int l, int h) {
    for (services.IRoute r : this.getListeRoute()) {
        if ((x < (x + (r.getLargeur()))) && (x > (r.getX())))
            if ((y < (y + (r.getHauteur()))) && (y > (r.getY())))
                return r;
            
        
    }
    return null;
}
public int compareTo(ClosestPair.Point p) {
    if ((this.x) == (p.x))
        if ((this.y) == (p.y))
            return 0;
        else
            return (this.y) > (p.y) ? 1 : -1;
        
    else
        return (this.x) > (p.x) ? 1 : -1;
    
}
public int compareTo(barn1474.AStar.Node other) {
    f = (g) + (h);
    o = (other.g) + (other.h);
    if ((f) < (o))
        return -1;
    
    if ((f) > (o))
        return 1;
    
    return 0;
}
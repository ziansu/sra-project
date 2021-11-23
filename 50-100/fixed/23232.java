public int compareTo(barn1474.AStar.Node other) {
    double f = (g) + (h);
    double o = (other.g) + (other.h);
    if (f < o)
        return -1;
    
    if (f > o)
        return 1;
    
    return 0;
}
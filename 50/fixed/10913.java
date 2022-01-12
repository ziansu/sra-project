@java.lang.Override
public int compareTo(evolution.MutableMLP o) {
    if ((this.score) < (o.score))
        return 1;
    
    if ((this.score) > (o.score))
        return -1;
    
    return 0;
}
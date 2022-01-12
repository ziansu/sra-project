public double utility() {
    if ((visits) == 0)
        return putInBounds(1);
    
    return putInBounds(score(0, root));
}
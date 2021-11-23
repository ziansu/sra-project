public double getMedian() {
    if ((l1) == (l2)) {
        if ((l1) == 0)
            return 0;
        
        return ((less.peek()) + (more.peek())) / 2.0;
    }else
        if ((l1) > (l2))
            return less.peek();
        
    
    return more.peek();
}
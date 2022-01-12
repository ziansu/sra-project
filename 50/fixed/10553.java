public int compareTo(Solution.Node node) {
    long data_b = node.data;
    if (data_b > (this.data))
        return -1;
    else
        if (data_b < (this.data))
            return 1;
        else
            return 0;
        
    
}
public int compareTo(Node n1) {
    if ((this.cost) > (n1.cost)) {
        return -1;
    }else
        if ((this.cost) < (n1.cost)) {
            return 1;
        }
    
    return 0;
}
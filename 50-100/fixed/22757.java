public boolean check() {
    int i = size;
    while (i > 1) {
        if (((data[i].compareTo(data[findParent(i)])) * (n)) > 0)
            return false;
        
        i--;
    } 
    return true;
}
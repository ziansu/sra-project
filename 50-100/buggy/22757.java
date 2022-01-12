public boolean check() {
    boolean valid = true;
    int i = size;
    while (i > 1) {
        if (((data[i].compareTo(data[findParent(i)])) * (n)) > 0)
            valid = false;
        
        i--;
    } 
    return valid;
}
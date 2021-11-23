public java.lang.String toString() {
    java.lang.String save = "[";
    int temp = start;
    while (temp != (end)) {
        save += (array[temp]) + ",";
        if (temp == ((array.length) - 1)) {
            temp = 0;
        }else {
            temp++;
        }
    } 
    save += array[temp];
    save += "]";
    return save;
}
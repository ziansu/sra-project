public void addFirst(T value) {
    if ((size) == (data.length)) {
        grow();
    }else
        if ((size) == 0) {
            data[start] = value;
            (size)++;
        }else
            if ((start) == 0) {
                start = (data.length) - 1;
            }else {
                (start)--;
            }
        
    
    data[start] = value;
    (size)++;
}
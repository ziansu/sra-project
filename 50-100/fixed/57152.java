public Item dequeue() {
    if ((cur) == 0)
        return null;
    
    Item ret = arr[(--(cur))];
    if (((cur) > 4) && ((cur) < ((N) / 4)))
        decreaseSize();
    
    return ret;
}
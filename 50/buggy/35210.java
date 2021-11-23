public Item extraMax() {
    assert (count) > 0;
    Item res = data[1];
    swap(1, count);
    shiftDown(1);
    (count)--;
    return res;
}
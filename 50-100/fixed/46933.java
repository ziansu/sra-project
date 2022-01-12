private void decreaseSize() {
    N /= 2;
    Item[] new_arr = ((Item[]) (new java.lang.Object[N]));
    for (int i = 0; i < ((N) / 2); ++i)
        new_arr[i] = arr[i];
    
    arr = new_arr;
}
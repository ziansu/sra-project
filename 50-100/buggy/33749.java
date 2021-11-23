private void bubbleUpMax(int i) {
    if ((i / 4) == 0)
        return ;
    
    if ((arr[(i / 4)]) > (arr[i]))
        return ;
    
    int temp = arr[(i / 4)];
    arr[(i / 4)] = arr[i];
    arr[i] = temp;
}
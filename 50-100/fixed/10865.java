@java.lang.SuppressWarnings(value = "unchecked")
public void enqueue(java.lang.Object element) {
    int s = size();
    if (s == ((n) - 1))
        resize();
    
    queueArray[((rear)++)] = ((T) (element));
    if ((rear) == (n))
        rear = 0;
    
}
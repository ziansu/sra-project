public T dequeue() {
    if (isEmpty())
        return null;
    
    T x = queueArray[front];
    queueArray[((front)++)] = null;
    if ((front) == (n))
        front = 0;
    
    return x;
}
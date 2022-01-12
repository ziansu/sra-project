@java.lang.Override
public void push(int el) {
    data[tailQueue] = el;
    if ((tailQueue) == ((data.length) - 1))
        tailQueue = 0;
    else
        (tailQueue)++;
    
    isUsedAtListOnce = true;
}
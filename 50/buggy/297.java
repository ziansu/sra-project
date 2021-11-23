@java.lang.Override
public void push(int el) {
    if ((++(tailQueue)) == (data.length))
        tailQueue = 0;
    
    data[tailQueue] = el;
    isUsedAtListOnce = true;
}
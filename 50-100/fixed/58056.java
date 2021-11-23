private void updateQueueStack(boolean isNext) {
    if (isNext) {
        if ((queueStack) > 0)
            (queueStack)--;
        
    }else
        (queueStack)++;
    
    if (((queueStack) > (queueCount)) || ((queueStack) == 0)) {
        queueStack = 0;
        queueCount = 0;
    }
}
public T dequeue() {
    synchronized(queLocker) {
        while ((i_size) == 0) {
            if ((producers) == 0) {
                return null;
            }
            try {
                queLocker.wait();
            } catch (java.lang.Exception e) {
                e.printStackTrace();
            }
        } 
        T i_item = buffer[i_startingPoint];
        (i_size)--;
        i_startingPoint = ((i_startingPoint)++) % (i_capacity);
        queLocker.notifyAll();
        return i_item;
    }
}
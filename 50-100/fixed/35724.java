@java.lang.Override
public void succeeded() {
    while (true) {
        int current = count.get();
        if (current == 0)
            return ;
        
        if (count.compareAndSet(current, (current - 1))) {
            if (current == 1)
                callback.succeeded();
            
            return ;
        }
    } 
}
@java.lang.Override
public java.util.function.Supplier<T> supplier() {
    return () -> {
        if (iterator.hasNext())
            return ((T) (iterator.next()));
        else
            if (cycle) {
                this.iterator = iterable.iterator();
                return ((T) (iterator.next()));
            }else
                return ((T) (after.get()));
            
        
    };
}
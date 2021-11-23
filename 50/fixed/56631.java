@java.lang.Override
public int getCount() {
    synchronized(data) {
        if ((ctx) != null)
            return data.size();
        else
            return 0;
        
    }
}
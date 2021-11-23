@java.lang.Override
public void run() {
    if ((time.get()) <= (endTime))
        setTime(((time.get()) + 1));
    else
        setTime(endTime);
    
}
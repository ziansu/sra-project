@java.lang.Override
public void close() {
    if ((delegate) == null)
        super.close();
    else
        delegate.close();
    
}
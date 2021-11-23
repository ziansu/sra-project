@java.lang.Override
public void sendInput(TResult result, java.lang.Throwable throwable) {
    if (throwable == null)
        return ;
    
    onRejected.runWith(throwable, this, this, this);
}
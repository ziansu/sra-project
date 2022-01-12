@java.lang.Override
public void finish() {
    if (null != (getPage()))
        getPage().onFinish();
    
    super.finish();
}
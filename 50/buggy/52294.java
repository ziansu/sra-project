@java.lang.Override
protected void validateSealed() {
    if (!(mySealed)) {
        synchronized(myContext) {
            sealAndInitialize(myContext, myClassToElementDefinitions);
        }
    }
}
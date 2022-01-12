@java.lang.Override
protected void validateSealed() {
    if (!(mySealed)) {
        synchronized(myContext) {
            if (!(mySealed)) {
                sealAndInitialize(myContext, myClassToElementDefinitions);
            }
        }
    }
}
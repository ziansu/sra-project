@java.lang.Override
public java.lang.Boolean apply(java.lang.Boolean aBoolean) throws java.lang.Exception {
    _log("We are inside map operator of Observable");
    _doSomethingLong();
    return aBoolean;
}
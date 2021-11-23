@java.lang.Override
public java.util.Iterator<java.lang.String> getNgramIterator(int n) throws java.lang.Exception {
    return new com.googlecode.jweb1t.JWeb1TIterator(basePath, 1).getIterator();
}
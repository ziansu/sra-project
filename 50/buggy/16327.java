@java.lang.Override
public boolean visit(java.lang.CharSequence name) throws java.lang.Exception {
    headerMap.put(name.toString(), httpRequest.headers().getAllAndConvert(name));
    return true;
}
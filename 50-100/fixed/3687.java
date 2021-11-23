private final boolean _log(simple.util.logging.LogLevel type, java.lang.String ref, java.lang.Object msg, byte options) {
    if (!(simple.util.logging.Log.isSet(options, type)))
        return _out.checkError();
    
    synchronized(writeSync) {
        _out.print(_getPreMessage(type));
        _out.print(_cName);
        _out.print(": ");
        _out.print(ref);
        _out.print(": ");
        _out.println(msg);
    }
    return _out.checkError();
}
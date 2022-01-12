private final boolean _log(simple.util.logging.LogLevel type, java.lang.String msg, java.lang.Throwable e, byte options) {
    if (simple.util.logging.Log.isSet(options, type))
        return _out.checkError();
    
    synchronized(writeSync) {
        _out.print(_getPreMessage(type));
        _out.print(_cName);
        _out.print(": ");
        _out.println(msg);
        e.printStackTrace(_out);
    }
    return _out.checkError();
}
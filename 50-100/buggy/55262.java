private final boolean _log(simple.util.logging.LogLevel type, java.lang.Throwable msg, byte options) {
    if (simple.util.logging.Log.isSet(options, type))
        return _out.checkError();
    
    synchronized(writeSync) {
        _out.println(_getPreMessage(type));
        _out.print(_cName);
        _out.print(": ");
        _out.println(msg);
        msg.printStackTrace(_out);
    }
    return _out.checkError();
}
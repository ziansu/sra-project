@java.lang.Override
public void run() {
    try {
        char[] buffer = new char[_bufferSize];
        int amount = 0;
        while ((amount = _reader.read(buffer, 0, _bufferSize)) != (-1)) {
            sink(buffer, amount);
        } 
    } catch (java.io.IOException e) {
        sinkError(e);
    } finally {
        try {
            _reader.close();
        } catch (java.lang.Exception e) {
        }
    }
}
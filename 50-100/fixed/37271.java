@java.lang.Override
@java.lang.SuppressWarnings(value = "PMD")
public final void run() {
    try {
        if ((inputStream.available()) <= 0) {
            return ;
        }
        int c = inputStream.read();
        while ((c != (-1)) && ((inputStream.available()) > 0)) {
            buffer.append(((char) (c)));
            c = inputStream.read();
        } 
        finished = true;
    } catch (final java.lang.Exception e) {
    }
}
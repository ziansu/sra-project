@java.lang.Override
public void run() {
    listener.onProgress(bytesRead, contentLength);
}
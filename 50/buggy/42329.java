@java.lang.Override
public void enqueue(byte[] data) throws java.io.IOException {
    this.innerArray.append(data);
    completeFuture();
}
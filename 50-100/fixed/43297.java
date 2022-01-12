@java.lang.Override
public synchronized byte[] array() {
    byte[] arr = new byte[this.container.size()];
    for (int i = 0; i < (this.container.size()); i++)
        arr[i] = this.container.get(i);
    
    return arr;
}
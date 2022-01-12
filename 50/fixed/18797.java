@java.lang.Override
public void delete(int key) {
    if ((this.getRoot()) != null)
        this.getRoot().delete(key);
    
}
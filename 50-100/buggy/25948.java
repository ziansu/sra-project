@java.lang.Override
public void conectar() throws java.lang.Exception {
    try {
        this.connected = true;
        this.busy = true;
        this.dslam.conectar();
    } catch (java.lang.Exception e) {
        this.connected = false;
        throw e;
    } finally {
        this.busy = false;
    }
}
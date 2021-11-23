@java.lang.Override
public void conectar() throws java.lang.Exception {
    try {
        this.busy = true;
        this.connected = true;
        this.dslam.conectar();
    } catch (java.lang.Exception e) {
        this.connected = false;
        throw e;
    } finally {
        this.busy = false;
    }
}
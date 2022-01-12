@java.lang.Override
public boolean connect() {
    commError = 0;
    return (proxy.open()) && (comm.open());
}
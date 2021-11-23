@java.lang.Override
public void setOTSAddress(int i) {
    otsAddress[0] = ((byte) (i >> 16));
    otsAddress[1] = ((byte) (i >> 8));
    otsAddress[2] = ((byte) (i));
}
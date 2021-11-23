@java.lang.Override
public void setOTSAddress(int i) {
    otsAddress[0] = ((byte) (i >> 24));
    otsAddress[1] = ((byte) (i >> 16));
    otsAddress[2] = ((byte) (i >> 8));
    otsAddress[3] = ((byte) (i));
}
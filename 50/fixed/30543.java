@java.lang.Override
public java.lang.String getIPv4() {
    java.lang.String[] aux = nic.getIPv4addr();
    java.lang.String j = aux[0];
    return j;
}
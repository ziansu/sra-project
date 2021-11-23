@java.lang.Override
public boolean extract(java.lang.String data) {
    int i = data.indexOf("\n");
    if ((i > 0) && ((i + 1) < (data.length()))) {
        key = decc.dht.Key.load(data.substring(0, i));
        ip = data.substring((i + 1));
    }
    return (i > 0) && ((ip.length()) > 0);
}
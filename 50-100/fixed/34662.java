@java.lang.Override
public void deco(decc.Peer p) {
    java.lang.System.out.println(("Peer deco : " + (p.getHostName())));
    try {
        p.close();
        pairs.remove(p.getHostName());
        if ((ip) != null) {
            for (decc.Peer pe : pairs.values())
                pe.sendBrcast(ip);
            
        }
        userclb.onPeerDeco(p.getHostName());
    } catch (java.io.IOException e) {
        e.printStackTrace();
    }
}
public void checkLogs() {
    for (java.io.File f : dbdLogDir.listFiles()) {
        if (f != null) {
            if (f.isDirectory())
                continue;
            
            if (!(f.getName().endsWith(".log")))
                continue;
            
            java.lang.System.out.println(f.getName());
            processLog(f);
        }
    }
    java.lang.System.out.println((("Identified " + (mlga.io.peer.PeerTracker.peers.size())) + " unique user/ip combos!"));
    active = false;
}
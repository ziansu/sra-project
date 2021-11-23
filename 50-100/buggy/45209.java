public static int open(int port, int expiresSeconds, java.lang.String htmlPath, boolean force) throws java.io.IOException {
    int ap = 0;
    while (true) {
        try {
            net.yacy.grid.http.APIServer.open((port + ap), expiresSeconds, htmlPath);
            return port + ap;
        } catch (java.io.IOException e) {
            if (force || (ap >= 16)) {
                e.printStackTrace();
                throw e;
            }
            ap++;
            continue;
        }
    } 
}
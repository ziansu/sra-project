@java.lang.Override
public synchronized void close() {
    if ((this.sps) != null) {
        if (sps.close()) {
            java.lang.String file = outputSpec.getFile();
            if (file != null) {
                io.fabric8.maven.docker.log.DefaultLogCallback.printStreamMap.remove(file);
            }
            this.sps = null;
        }
    }
}
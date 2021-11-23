public static int getLOC() {
    if ((net.sf.memoranda.CurrentProject.ep) == null) {
        return -1;
    }else {
        return net.sf.memoranda.CurrentProject.ep.getT();
    }
}
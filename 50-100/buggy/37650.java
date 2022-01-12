private void writeObject(java.io.ObjectOutputStream oos) throws java.io.IOException {
    oos.defaultWriteObject();
    java.util.List<com.kappa_labs.ohunter.lib.entities.Photo> phs = new java.util.ArrayList<>();
    for (com.kappa_labs.ohunter.lib.entities.Photo p : photos) {
        if ((p.sImage) != null) {
            p.sImage = new com.kappa_labs.ohunter.lib.entities.SImage(p.sImage);
        }
        if ((p._sImage) != null) {
            p._sImage = new com.kappa_labs.ohunter.lib.entities.SImage(p._sImage);
        }
        phs.add(p);
    }
    oos.writeObject(phs);
}
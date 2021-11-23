public java.util.LinkedList<edu.mit.kacquah.deckviewer.deckobjects.FlyingObject> getHoverObjects() {
    synchronized(this) {
        return this.hoverObjects;
    }
}
private boolean singleGender() {
    java.util.Queue<Human> snap = new java.util.LinkedList<Human>(humans);
    Human current = snap.poll();
    boolean result = true;
    while ((snap.size()) > 0) {
        result = result && (current.getGender().equals(snap.peek()));
        current = snap.poll();
    } 
    return result;
}
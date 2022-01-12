public Client.ClientObject get(int id) {
    try {
        for (Client.ClientObject object : objects) {
            if ((object.getID()) == id) {
                return object;
            }
        }
    } catch (java.util.ConcurrentModificationException e) {
        java.lang.System.out.println("Concurrent modification occured");
        e.printStackTrace();
    }
    return null;
}
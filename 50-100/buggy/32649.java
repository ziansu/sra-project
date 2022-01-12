public boolean placedOnNode(testProject.Node a) {
    try {
        for (testProject.Node n : nodes) {
            if ((((nodes.size()) > 1) && (a.getBounds().intersects(n.getBounds()))) && (n != a))
                nodes.remove(n);
            
            return true;
        }
        return false;
    } catch (java.lang.NullPointerException e) {
        return false;
    }
}
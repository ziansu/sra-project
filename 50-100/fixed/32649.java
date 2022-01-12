public boolean placedOnNode(testProject.Node a) {
    try {
        for (testProject.Node n : nodes) {
            if ((((nodes.size()) > 1) && (n.getBounds().intersects(a.getBounds()))) && (n != a))
                nodes.remove(n);
            
            return true;
        }
        return false;
    } catch (java.lang.NullPointerException e) {
        return false;
    }
}
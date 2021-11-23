private void init(java.util.List<java.awt.Point> pointList) {
    this.points = pointList;
    orders = create();
    for (java.lang.String key : orders.keySet()) {
        java.util.List<java.lang.Integer> order = orders.get(key);
        com.mszychowiak.to.Visualisation.VisualisePanel panel = new com.mszychowiak.to.Visualisation.VisualisePanel();
    }
    java.lang.System.out.println("Finished");
    java.lang.System.exit(0);
}
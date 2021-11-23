public void add(ProjectSahara.Edge edge) {
    this.weight += edge.getWeight();
    java.lang.System.out.println(edge.getTargetNode());
    path.add(edge.getTargetNode());
}
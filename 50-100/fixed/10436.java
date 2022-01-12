public static void main(java.lang.String[] args) {
    java.util.Map<Node, java.lang.Integer> topology = new java.util.HashMap<Node, java.lang.Integer>();
    topology.put(new Node(1), 1);
    topology.put(new Node(2), 4);
    Network net = new Network(topology);
    java.lang.System.out.println(net);
}
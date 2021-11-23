@org.junit.BeforeClass
public static void setup() {
    org.graphast.query.route.shortestpath.BidirectionalDijkstraTest.graphHopperExample = new org.graphast.graphgenerator.GraphGenerator().generateGraphHopperExample();
    org.graphast.query.route.shortestpath.BidirectionalDijkstraTest.graphHopperExample2 = new org.graphast.graphgenerator.GraphGenerator().generateGraphHopperExample2();
    org.graphast.query.route.shortestpath.BidirectionalDijkstraTest.graphHopperExample3 = new org.graphast.graphgenerator.GraphGenerator().generateGraphHopperExample3();
    org.graphast.query.route.shortestpath.BidirectionalDijkstraTest.graphHopperExample4 = new org.graphast.graphgenerator.GraphGenerator().generateGraphHopperExample4();
    org.graphast.query.route.shortestpath.BidirectionalDijkstraTest.graphMITExample = new org.graphast.graphgenerator.GraphGenerator().generateMITExample();
    org.graphast.query.route.shortestpath.BidirectionalDijkstraTest.graphMITExample2 = new org.graphast.graphgenerator.GraphGenerator().generateMITExample2();
    org.graphast.query.route.shortestpath.BidirectionalDijkstraTest.graphMonaco = new org.graphast.graphgenerator.GraphGenerator().generateMonacoCH();
    org.graphast.query.route.shortestpath.BidirectionalDijkstraTest.graphSeattle = new org.graphast.graphgenerator.GraphGenerator().generateSeattleCH();
}
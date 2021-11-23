@org.junit.BeforeClass
public static void setUp() {
    java.net.URL url = algorithm.KDTreeProperties.class.getResource("/karlsruhe.osm");
    algorithm.GeometryParser parser = new visibility.osm.OSMGeometryParser();
    java.util.List<algorithm.Triangle> triangles = parser.parseFile(url.getFile());
    algorithm.KDTreeProperties.kdTree = visibility.algorithm.KDTree.fromTriangles(triangles);
    algorithm.KDTreeProperties.naive = visibility.algorithm.NaiveIntersection.fromTriangles(triangles);
}
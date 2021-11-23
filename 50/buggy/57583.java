@java.lang.Override
public org.neo4j.graphdb.traversal.Evaluation evaluate(org.neo4j.graphdb.Path path) {
    java.lang.System.out.println(path);
    return _evaluate_(path, thes);
}
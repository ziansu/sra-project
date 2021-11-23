public static void groupByPlanner(final com.ardor3d.scenegraph.Mesh mesh, final com.ardor3d.scenegraph.Node root, final java.util.List<java.util.List<com.ardor3d.math.type.ReadOnlyVector3>> holes) {
    final java.util.ArrayList<org.concord.energy3d.util.MeshLib.GroupData> groups = org.concord.energy3d.util.MeshLib.extractGroups(mesh);
    org.concord.energy3d.util.MeshLib.computeHorizontalTextureCoords(groups);
    org.concord.energy3d.util.MeshLib.createMeshes(root, groups);
    org.concord.energy3d.util.MeshLib.applyHoles(root, holes);
}
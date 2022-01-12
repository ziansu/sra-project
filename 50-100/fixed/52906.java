private void writeOneNodeObstaclesInOsmDatabase(java.util.List<bp17.jerseyserver.service.Obstacle> obstacleList) {
    try {
        for (bp17.jerseyserver.service.Obstacle o : obstacleList) {
            insertObstacleInTableNode(o, updateNodes);
            updateTableWays(o, updateWays);
            updateTableWay_nodes(o, updateWay_Nodes, updateWay_Nodes2, insertWay_Nodes, getSequenceId);
        }
        c.commit();
        java.lang.System.out.println("UPDATE OSM DB COMPLETED");
    } catch (java.sql.SQLException e) {
        e.printStackTrace();
        try {
            c.rollback();
        } catch (java.sql.SQLException e1) {
            e1.printStackTrace();
        }
    }
}
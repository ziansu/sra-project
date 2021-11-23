public static boolean Comp(com.dag.DAG d1, com.dag.DAG d2) {
    com.dag.DAG d = com.dag.DAG.IntersectDAG(d1, d2);
    if (d.isCovered())
        return false;
    else
        return true;
    
}
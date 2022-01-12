public static int seqCount(int target, aeminium.runtime.benchmarks.fjtests.aeminium.Graph graph) {
    int t;
    if (target == (graph.value))
        t = 1;
    else
        t = 0;
    
    for (int i = 0; i < (graph.children.length); i++) {
        t += aeminium.runtime.benchmarks.fjtests.forkjoin.BFS.seqCount(target, graph.children[0]);
    }
    return t;
}
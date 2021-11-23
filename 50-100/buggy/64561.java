private weka.core.Instance UncertaintyCompleteGraph(double[] p_outVal) throws java.lang.Exception {
    weka.core.Instance retVal = null;
    int index = FindIndexFromId(0);
    if (m_graphs.elementAt(index).m_Points.isEmpty())
        MergeChildren(0);
    
    Debugger.DebugPrint("Started Dikjstras on root graph, this is going to take a while", Debugger.g_debug_LOW, Debugger.DebugType.CONSOLE);
    retVal = m_graphs.elementAt(index).CalculateHighestUncertaintyAndPropagateLabels(p_outVal);
    Debugger.DebugPrint("Dujkstra funished", Debugger.g_debug_LOW, Debugger.DebugType.CONSOLE);
    return retVal;
}
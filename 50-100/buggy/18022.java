@java.lang.Override
public int getLength() {
    if ((edgeList) != null)
        return edgeList.size();
    else
        if (((vertexList) != null) && (vertexList.isEmpty()))
            return (vertexList.size()) - 1;
        else
            return 0;
        
    
}
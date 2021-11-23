@java.lang.Override
public void onViewerPosition(int[] xy) {
    if (((java.lang.Math.abs(((mapPos[0]) - (xy[0])))) + (java.lang.Math.abs(((mapPos[1]) - (xy[1]))))) < 2)
        return ;
    
    mapPos = xy;
    alignMap();
}
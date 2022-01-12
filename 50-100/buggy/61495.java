@java.lang.Override
public void onViewerPosition(int[] xy) {
    if (((java.lang.Math.abs(((mapPos[0]) - (xy[0])))) + (java.lang.Math.abs(((mapPos[1]) - (xy[1]))))) < 2)
        return ;
    
    android.util.Log.d(TAG, java.lang.String.format("Map Pos: %1$d,%2$d", xy[0], xy[1]));
    mapPos = xy;
    alignMap();
}
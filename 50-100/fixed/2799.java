@java.lang.Override
public void dispose() {
    for (com.mbrlabs.mundus.tools.brushes.TerrainBrush brush : terrainBrushes) {
        brush.dispose();
    }
    translateTool.dispose();
    modelPlacementTool.dispose();
    selectionTool.dispose();
    rotateTool.dispose();
    scaleTool.dispose();
}
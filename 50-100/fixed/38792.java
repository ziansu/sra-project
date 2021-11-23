private void drawCurrentWalkablePath() {
    pathGenerating = false;
    leafletView.post(new java.lang.Runnable() {
        @java.lang.Override
        public void run() {
            if ((currentPathTiles.get(currentFloor)) != null) {
                if (pageLoaded)
                    leafletView.evaluateJavascript((("drawWalkablePath(" + (com.concordia.mcga.utilities.pathfinding.SingleMapPathFinder.toJSONArray(currentPathTiles.get(currentFloor)).toString())) + ")"), null);
                
            }else {
                if (pageLoaded)
                    leafletView.evaluateJavascript("clearPathLayers()", null);
                
            }
        }
    });
}
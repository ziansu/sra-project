@java.lang.Override
public void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setupLocationClient();
    mPointQuadTree = new com.google.maps.android.quadtree.PointQuadTree<com.fabiendem.defib68.models.defibrillator.DefibrillatorClusterItem>(com.fabiendem.defib68.utils.HautRhinUtils.LEFT_BOUND, com.fabiendem.defib68.utils.HautRhinUtils.RIGHT_BOUND, com.fabiendem.defib68.utils.HautRhinUtils.BOTTOM_BOUND, com.fabiendem.defib68.utils.HautRhinUtils.TOP_BOUND);
    mMapDefibrillators = new java.util.HashMap<java.lang.String, com.fabiendem.defib68.models.defibrillator.DefibrillatorModel>();
}
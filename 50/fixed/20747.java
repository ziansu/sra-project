@java.lang.Override
public double getHorizon() {
    getDimensionInformation();
    if (((dimensionInformation) != null) && (dimensionInformation.getTerrainType().hasNoHorizon())) {
        return 0;
    }else {
        return super.getHorizon();
    }
}
@java.lang.Override
public void configure() {
    config = edu.stanford.rsl.conrad.utils.Configuration.getGlobalConfiguration();
    image = ij.IJ.getImage();
    configured = true;
    if ((nrOfBeads) > 0) {
        initializeMarkerPositions(nrOfBeads);
    }else {
        fastRadialSymmetrySpace = FRST();
        edu.stanford.rsl.conrad.data.numeric.Grid3D frst = new edu.stanford.rsl.conrad.data.numeric.Grid3D(fastRadialSymmetrySpace);
        initializeMarkerPositions(frst, false);
    }
    update2Dreference();
    configured = true;
}
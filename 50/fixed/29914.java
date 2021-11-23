public void setTectonicRegionType(org.opensha.sha.util.TectonicRegionType tectRegType) {
    for (int r = 0; r < (ruptureList.size()); r++) {
        ruptureList.get(r).setTectRegType(tectRegType);
    }
    super.setTectonicRegionType(tectRegType);
}
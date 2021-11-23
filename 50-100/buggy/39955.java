public ucar.nc2.grib.GdsHorizCoordSys makeHorizCoordSys() {
    ucar.unidata.geoloc.projection.LatLonProjection proj = new ucar.unidata.geoloc.projection.LatLonProjection(getEarth());
    ucar.nc2.grib.grib1.ProjectionPoint startP = proj.latLonToProj(new ucar.nc2.grib.grib1.LatLonPointImpl(la1, lo1));
    double startx = startP.getX();
    double starty = startP.getY();
    return new ucar.nc2.grib.GdsHorizCoordSys(getNameShort(), template, 0, scanMode, proj, startx, getDx(), starty, getDy(), getNx(), getNy(), null);
}
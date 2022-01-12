@java.lang.Override
public ucar.nc2.grib.GdsHorizCoordSys makeHorizCoordSys() {
    ucar.unidata.geoloc.projection.LatLonProjection proj = new ucar.unidata.geoloc.projection.LatLonProjection(getEarth());
    double startx = lo1;
    double starty = la1;
    return new ucar.nc2.grib.GdsHorizCoordSys(getNameShort(), template, 0, scanMode, proj, startx, getDx(), starty, getDy(), getNx(), getNy(), null);
}
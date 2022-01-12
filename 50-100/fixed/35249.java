public ucar.nc2.grib.GdsHorizCoordSys makeHorizCoordSys() {
    ucar.unidata.geoloc.projection.LatLonProjection proj = new ucar.unidata.geoloc.projection.LatLonProjection(getEarth());
    double startx = lo1;
    double starty = la1;
    return new ucar.nc2.grib.GdsHorizCoordSys(getNameShort(), template, getOctet4(7), scanMode, proj, startx, deltaLon, starty, deltaLat, getNxRaw(), getNyRaw(), getNptsInLine());
}
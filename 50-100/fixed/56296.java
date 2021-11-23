public studio.tmaker.jason.tmcore.TMLocation converter(java.lang.String gps) {
    java.lang.String[] parts = gps.split(",");
    if ((parts.length) == 2) {
        studio.tmaker.jason.tmcore.TMLocation tmLocation = new studio.tmaker.jason.tmcore.TMLocation();
        tmLocation.setLatitude(java.lang.Double.parseDouble(parts[0]));
        tmLocation.setLongitude(java.lang.Double.parseDouble(parts[1]));
        return tmLocation;
    }else {
        return new studio.tmaker.jason.tmcore.TMLocation();
    }
}
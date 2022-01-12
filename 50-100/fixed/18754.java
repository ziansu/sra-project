static android.vic.MapManager.LatLng convert(android.vic.MapManager.LatLng point, android.vic.MapManager.CoordinateConverter.CoordinateType from) {
    android.vic.MapManager.CoordinateConverter converter = new android.vic.MapManager.CoordinateConverter();
    if (from.equals(android.vic.MapManager.CoordinateConverter.CoordinateType.GCJ_05))
        converter.from(android.vic.MapManager.com.baidu.mapapi.utils.CoordinateConverter);
    else
        if (from.equals(android.vic.MapManager.CoordinateConverter.CoordinateType.WGS))
            converter.from(android.vic.MapManager.com.baidu.mapapi.utils.CoordinateConverter);
        else
            return point;
        
    
    converter.coord(new android.vic.MapManager.LatLng(point.latitude, point.longitude));
    android.vic.MapManager.LatLng ll = converter.convert();
    return new android.vic.MapManager.LatLng(ll.latitude, ll.longitude);
}
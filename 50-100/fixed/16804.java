boolean checkreach(com.baidu.mapapi.model.LatLng desLatLng) {
    if (((java.lang.Math.abs(((pointlocation[currentpoint][0]) - (desLatLng.longitude)))) < (delta)) && ((java.lang.Math.abs(((pointlocation[currentpoint][1]) - (desLatLng.latitude)))) < (delta))) {
        android.widget.Toast.makeText(getApplicationContext(), ("One point reached!" + (currentpoint)), Toast.LENGTH_LONG).show();
        return true;
    }else
        return false;
    
}
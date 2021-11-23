@org.junit.Test
public void testGetCoordinates() {
    com.google.android.gms.maps.model.LatLng expectedAnswer1 = new com.google.android.gms.maps.model.LatLng(40.01277732, (-75.15383119));
    com.google.android.gms.maps.model.LatLng actualAnswer1 = testCrimeData.getCoordinates(sampleJson1);
    junit.framework.Assert.assertEquals(expectedAnswer1, actualAnswer1);
    com.google.android.gms.maps.model.LatLng expectedAnswer2 = new com.google.android.gms.maps.model.LatLng(39.98790629, (-75.24043568));
    com.google.android.gms.maps.model.LatLng actualAnswer2 = testCrimeData.getCoordinates(sampleJson2);
    junit.framework.Assert.assertEquals(expectedAnswer2, actualAnswer2);
}
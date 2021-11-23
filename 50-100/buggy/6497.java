@org.junit.Test
public void testGetCoordinates() {
    com.google.android.gms.maps.model.LatLng expectedAnswer1 = new com.google.android.gms.maps.model.LatLng((-75.15383119), 40.01277732);
    com.google.android.gms.maps.model.LatLng actualAnswer1 = testCrimeData.getCoordinates(sampleJson1);
    junit.framework.Assert.assertEquals(expectedAnswer1, actualAnswer1);
    com.google.android.gms.maps.model.LatLng expectedAnswer2 = new com.google.android.gms.maps.model.LatLng((-75.24043568), 39.98790629);
    com.google.android.gms.maps.model.LatLng actualAnswer2 = testCrimeData.getCoordinates(sampleJson2);
    junit.framework.Assert.assertEquals(expectedAnswer2, actualAnswer2);
}
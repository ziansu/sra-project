@java.lang.Override
public ge.edu.freeuni.sdp.iot.sensor.bath_humidity.model.Humidity getLast(java.lang.String houseId) {
    return measurements.get(houseId).get(0);
}
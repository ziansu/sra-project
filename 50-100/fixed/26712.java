@java.lang.Override
public boolean equals(java.lang.Object obj) {
    if (obj == (this)) {
        return true;
    }
    if (!(obj instanceof com.jimandlisa.reportAircraftNoise.Database.ReadIncident)) {
        return false;
    }
    return ((com.jimandlisa.reportAircraftNoise.Database.ReadIncident) (obj)).id.equals(id);
}
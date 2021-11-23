@java.lang.Override
public int compareTo(java.lang.Object o) {
    info.losd.galen.repository.dto.HealthcheckStatistic that = ((info.losd.galen.repository.dto.HealthcheckStatistic) (o));
    if (((this.timestamp.equals(that.timestamp)) && ((this.responseTime) == (that.responseTime))) && ((this.statusCode) == (that.statusCode))) {
        return 0;
    }else
        if (this.timestamp.isBefore(that.timestamp)) {
            return -1;
        }
    
    return 1;
}
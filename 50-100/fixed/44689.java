@java.lang.Override
public boolean equals(java.lang.Object obj) {
    if ((obj == null) || ((obj.getClass()) != (this.getClass()))) {
        return false;
    }
    info.losd.galen.repository.dto.HealthcheckStatistic that = ((info.losd.galen.repository.dto.HealthcheckStatistic) (obj));
    return ((this.timestamp.equals(that.timestamp)) && ((this.responseTime) == (that.responseTime))) && ((this.statusCode) == (that.statusCode));
}
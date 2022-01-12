@java.lang.Override
public boolean equals(java.lang.Object o) {
    if ((this) == o) {
        return true;
    }
    if ((o == null) || ((getClass()) != (o.getClass()))) {
        return false;
    }
    io.druid.java.util.common.granularity.PeriodSegmentGranularity that = ((io.druid.java.util.common.granularity.PeriodSegmentGranularity) (o));
    return periodGranularity.equals(that.periodGranularity);
}
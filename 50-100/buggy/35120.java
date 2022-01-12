public int compareTo(org.globus.cog.abstraction.coaster.service.job.manager.Cpu o) {
    org.globus.cog.abstraction.coaster.service.job.manager.TimeInterval diff = timelast.subtract(o.timelast);
    if ((diff.getMilliseconds()) == 0) {
        long l = (java.lang.System.identityHashCode(this)) - (java.lang.System.identityHashCode(o));
        return sgn(l);
    }else {
        return ((int) (diff.getMilliseconds()));
    }
}
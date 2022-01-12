@java.lang.Override
public void add(io.datakernel.jmx.ExceptionStats another) {
    this.count += another.count;
    if ((another.lastExceptionTimestamp) > (this.lastExceptionTimestamp)) {
        this.exceptionClass = another.exceptionClass;
        this.lastExceptionTimestamp = another.lastExceptionTimestamp;
        if ((another.details) != null) {
            if ((this.details) == null) {
                details = new io.datakernel.jmx.ExceptionStats.ExceptionDetails();
            }
            this.details.throwable = another.details.throwable;
            this.details.context = another.details.context;
        }
    }
}
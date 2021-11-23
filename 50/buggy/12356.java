@java.lang.Override
public boolean isReached() {
    org.apache.commons.lang3.Validate.isTrue(this.initialised);
    return ((this.startingTime) - (java.lang.System.currentTimeMillis())) > (this.timeout);
}
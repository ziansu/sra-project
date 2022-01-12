@java.lang.Override
public boolean ready() {
    return ((java.lang.System.currentTimeMillis()) - (this.start)) > (this.max);
}
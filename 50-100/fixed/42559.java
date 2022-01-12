@java.lang.Override
public boolean isDataBad() {
    return ((!(this.attempted)) && ((this.succeeded) || ((this.timeInSeconds) != 0))) || ((this.succeeded) && ((this.timeInSeconds) <= 0));
}
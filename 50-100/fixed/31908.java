@java.lang.Override
public boolean isDataBad() {
    return ((this.attempted) && (((this.touchPadPosition) == (TouchPadPosition.None)) || ((this.succeeded) && ((this.timeInSeconds) == 0)))) || ((!(this.attempted)) && (((this.succeeded) || (this.ownRope)) || ((this.touchPadPosition) != (TouchPadPosition.None))));
}
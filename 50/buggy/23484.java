@java.lang.Override
public boolean hasCompleted() {
    if (((this.desiredDTDistanceLeft) <= (this.currentDTDistanceLeft)) && ((this.desiredDTDistanceRight) <= (this.currentDTDistanceRight))) {
        return true;
    }else {
        return false;
    }
}
protected boolean isTimeUnitBlockAddedManuallyToContainer() {
    return (mTimeUnitBlocksContainer.sumAllTimeUnitBlockInSeconds()) > (mDayliTimer.getCounterValue());
}
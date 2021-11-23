public int getWarningLowSpaceSize() {
    return (getWarningLowSpaceIndicator()) == null ? 0 : ((getTotalDiskSize()) * (getWarningLowSpaceIndicator())) / 100;
}
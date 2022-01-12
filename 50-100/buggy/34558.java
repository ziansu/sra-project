private boolean prepareControllerForAquisition(org.micromanager.asidispim.Data.Devices.Sides side, boolean hardwareTimepoints) {
    return controller_.prepareControllerForAquisition(side, hardwareTimepoints, getChannelMode(), isMultichannel(), getNumChannels(), getNumSlices(), getNumTimepoints(), getTimePointInterval(), getNumSides(), getFirstSide(), useTimepointsCB_.isSelected(), getAcquisitionMode(), false, getDelayBeforeSide(), getStepSizeUm(), sliceTiming_);
}
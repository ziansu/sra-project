public boolean updateProduction(double diff) {
    _simStat.currentElectricity += diff;
    if ((_connect._simStat) != null) {
        _connect._simStat.currentElectricity += diff;
    }
    if (((_simStat.currentElectricity) > (_maxProduction)) || ((_simStat.currentElectricity) < (_minProduction))) {
        _simStat.isOk = false;
    }else {
        _simStat.isOk = false;
    }
    return _simStat.isOk;
}
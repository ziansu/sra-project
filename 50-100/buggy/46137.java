void revert() {
    this.legalX = this.oldLegalX;
    this.legalY = this.oldLegalY;
    this.alreadySaved = false;
    for (place.placers.analytical.HardblockConnectionLegalizer.Net net : this.nets)
        net.revert();
    
    for (place.placers.analytical.HardblockConnectionLegalizer.Crit crit : this.crits)
        crit.revert();
    
}
public void setMaxWlanStrength(int maxWlanStrength) {
    if ((((this.maxWlanStrength) > 1) && (maxWlanStrength < 1)) && (this.enabled))
        API.network.leaveWirelessNetwork(this);
    else
        if ((((this.maxWlanStrength) < 1) && (maxWlanStrength > 1)) && (this.enabled))
            API.network.joinWirelessNetwork(this);
        
    
    this.maxWlanStrength = maxWlanStrength;
    this.curWlanStrength = java.lang.Math.min(this.curWlanStrength, this.maxWlanStrength);
}
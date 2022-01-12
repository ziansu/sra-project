public eu.luminis.brains.TransmitResult transmit() {
    if ((excitation) > (threshold)) {
        eu.luminis.brains.TransmitResult result = new eu.luminis.brains.TransmitResult(excitation, axons);
        excitation = 0;
        return result;
    }else {
        this.excitation = ((this.excitation) > 0) ? (this.excitation) * (1 - (this.relaxation)) : 0;
        return new eu.luminis.brains.TransmitResult(0, new eu.luminis.brains.Axon[0]);
    }
}
public byte[] getFirmwareFile() {
    if ((this.firmwareFile) == null) {
        return new byte[]{  };
    }
    return this.firmwareFile.clone();
}
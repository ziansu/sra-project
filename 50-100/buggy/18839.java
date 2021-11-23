public void setAddress(java.lang.String address) throws xyz.swordfeng.jobsystem.ValidationError {
    if (address == null) {
        throw new xyz.swordfeng.jobsystem.ValidationError("Null address");
    }
    if ((name.length()) >= 200) {
        throw new xyz.swordfeng.jobsystem.ValidationError("Address too long");
    }
    this.address = address;
}
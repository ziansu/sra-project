public void setDestination(org.bukkit.Location location) {
    if (location != null) {
        this.location = location;
        this.isValid = true;
    }
    this.isValid = false;
}
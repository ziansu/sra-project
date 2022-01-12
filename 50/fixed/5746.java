@com.netcracker.smarthome.model.entities.OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
public java.util.List<com.netcracker.smarthome.model.entities.SmartHome> getSmartHomes() {
    return smartHomes;
}
@com.netcracker.smarthome.model.entities.OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
public java.util.List<com.netcracker.smarthome.model.entities.SmartHome> getSmartHomes() {
    for (com.netcracker.smarthome.model.entities.SmartHome smartHome : smartHomes) {
        org.hibernate.Hibernate.initialize(smartHome);
    }
    return smartHomes;
}
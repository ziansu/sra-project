public dev.wolveringer.bungeeutil.packets.PacketPlayOutEntityProperties addProperty(dev.wolveringer.bungeeutil.packets.PacketPlayOutEntityProperties.EntityProperty prop) {
    if ((this.properties) == null)
        this.properties = new java.util.ArrayList<>();
    
    this.properties.add(prop);
    return this;
}
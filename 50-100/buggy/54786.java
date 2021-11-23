@java.lang.Override
public org.spongepowered.api.service.permission.Subject get(java.lang.String identifier) {
    org.spongepowered.api.service.permission.Subject s = this.identifiersToSubject.get(identifier.toLowerCase());
    if (s == null) {
        s = new net.kaikk.mc.sponge.simplepermissions.subject.GroupSubject(identifier, this);
        this.identifiersToSubject.put(identifier, s);
    }
    return s;
}
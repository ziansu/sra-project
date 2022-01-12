@java.lang.Override
public dk.magenta.datafordeler.core.database.LookupDefinition getLookupDefinition() {
    dk.magenta.datafordeler.core.database.LookupDefinition lookupDefinition = new dk.magenta.datafordeler.core.database.LookupDefinition(this);
    if ((this.code) != null) {
        lookupDefinition.put(((dk.magenta.datafordeler.core.database.LookupDefinition.entityref) + ".roadCode"), this.code);
    }
    if ((this.name) != null) {
        lookupDefinition.put("coreData.name", this.name);
    }
    if ((this.municipalityCode) != null) {
        lookupDefinition.put(((dk.magenta.datafordeler.core.database.LookupDefinition.entityref) + ".municipalityCode"), this.municipalityCode);
    }
    return lookupDefinition;
}
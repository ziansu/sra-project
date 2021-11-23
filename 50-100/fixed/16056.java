@java.lang.Override
public boolean equals(java.lang.Object o) {
    if (!(o instanceof ledger.database.entity.Type))
        return false;
    
    ledger.database.entity.Type type2 = ((ledger.database.entity.Type) (o));
    if (!(this.name.equals(type2.getName())))
        return false;
    
    return this.description.equals(type2.getDescription());
}
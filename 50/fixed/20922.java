protected void assemble(org.joda.time.chrono.Fields fields) {
    if ((getBase()) == null) {
        super.assemble(fields);
        fields.era = org.joda.time.chrono.BISChronology.ERA_FIELD;
    }
}
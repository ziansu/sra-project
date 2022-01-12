public de.thm.ap.openfit.model.sugarORM.records.SubActivity add(de.thm.ap.openfit.model.IValue value) {
    values();
    value.setSubActivity(this);
    values.add(((de.thm.ap.openfit.model.sugarORM.records.Value) (value)));
    return this;
}
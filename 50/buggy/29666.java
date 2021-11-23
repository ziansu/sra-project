public com.cronutils.model.field.definition.FieldDayOfWeekDefinitionBuilder withMondayDoWValue(int mondayDoW) {
    if (mondayDoW != (this.mondayDoWValue)) {
        this.constraints.withShiftedStringMapping((mondayDoW - (this.mondayDoWValue)));
    }
    this.mondayDoWValue = mondayDoW;
    return this;
}
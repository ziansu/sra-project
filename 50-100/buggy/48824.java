public org.eyeseetea.malariacare.database.model.OptionAttribute getOptionAttribute() {
    if ((optionAttribute) == null) {
        if ((id_optionAttribute) == null)
            return null;
        
        optionAttribute = new com.raizlabs.android.dbflow.sql.language.Select().from(org.eyeseetea.malariacare.database.model.OptionAttribute.class).where(com.raizlabs.android.dbflow.sql.builder.Condition.column(OptionAttribute.Table.ID_OPTION_ATTRIBUTE).is(id_answer)).querySingle();
    }
    return optionAttribute;
}
@java.lang.Override
public models.Field updateField(models.Field field) {
    field.options = mergeOptions(field.options, field);
    if ((hasAnswers(field)) && (hasImmutablePropertiesUpdate(field))) {
        return null;
    }
    field.options = mergeOptions(field.options, field);
    play.db.jpa.JPA.em().merge(field);
    return field;
}
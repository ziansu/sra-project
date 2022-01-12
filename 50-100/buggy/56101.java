@java.lang.SuppressWarnings(value = "unchecked")
public <F extends com.yahoo.squidb.sql.Field<?>> F qualifyField(F field) {
    if (field instanceof com.yahoo.squidb.sql.Property<?>) {
        return ((F) (((com.yahoo.squidb.sql.Property<?>) (field)).asSelectionFromTable(this, null)));
    }else {
        return ((F) (com.yahoo.squidb.sql.Field.field(field.getName(), com.yahoo.squidb.sql.SqlTable.getName())));
    }
}
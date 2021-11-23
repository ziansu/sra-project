@java.lang.Override
public ff.db.Create set(final java.lang.String field, final java.lang.Object value) {
    if (value == null) {
        return this;
    }
    if (this.started) {
        this.fields.append(",");
        this.questions.append(",");
    }else {
        this.started = true;
    }
    this.fields.append(this.dialect.columnName(field));
    this.questions.append("?");
    this.values.add(value);
    return this;
}
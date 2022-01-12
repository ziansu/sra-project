public void setFormat(ru.foxling.graphit.config.Format format) throws java.lang.IllegalArgumentException {
    if (format == null)
        throw new java.lang.IllegalArgumentException("Попытка установить NULL-формат");
    
    if (this.format.equals(format))
        return ;
    
    this.format = format;
    fireFieldChanged(new ru.foxling.graphit.config.FieldEvent(this, FieldEvent.UPDATE, "format"));
    setParser(ru.foxling.graphit.config.DefaultParser.getDefaultParser(this.datatype, this.format));
}
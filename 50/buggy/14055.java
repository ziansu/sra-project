public void setParser(ru.foxling.graphit.config.Parser<?> parser) {
    if (parser.equals(this.parser))
        return ;
    
    this.parser = parser;
    fireFieldChanged(new ru.foxling.graphit.config.FieldEvent(this, FieldEvent.UPDATE, "parser"));
}
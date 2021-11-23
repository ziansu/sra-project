public void log(LogManager.Type type, java.lang.String string) {
    if (((type.getValue()) >= (this.type.getValue())) && ((handler) != null)) {
        if ((filter) != null) {
            if (filter.filter_message(string)) {
                handler.writeMessage(string);
            }
        }else {
            handler.writeMessage(string);
        }
    }
    for (Logger log : loggers) {
        log.log(type, string);
    }
}
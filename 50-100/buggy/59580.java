public void log(LogManager.Type type, java.lang.String string) {
    if ((type == (LogManager.Type.ALL)) || (type == (this.type))) {
        if (filter.filter_message(string))
            handler.writeMessage(string);
        
    }
    if (((loggers) != null) && (!(loggers.isEmpty())))
        for (Logger log : loggers) {
            log.log(type, string);
        }
    
}
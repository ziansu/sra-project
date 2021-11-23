public <T> void registerGlobal(java.lang.String display, T value) {
    if (value == null)
        return ;
    
    globals.add(new io.f8k.fleet.common.log.LogEntryProperty(display, value.toString()));
}
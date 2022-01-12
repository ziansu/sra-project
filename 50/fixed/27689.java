@java.lang.Override
void handle(java.util.List<java.lang.String> fieldValues) {
    if ((value) > (-1))
        receiveAlarmLimit(name, units, fieldValues.get(value), limitType);
    
}
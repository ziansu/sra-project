@java.lang.Override
void handle(java.util.List<java.lang.String> fieldValues) {
    receiveAlarmLimit(name, units, fieldValues.get(value), limitType);
}
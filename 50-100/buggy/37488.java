public void updateTrapNotifications() {
    java.lang.Object[] array = snmpTrapReceiverBean.getTrapReceiver().getReceivedTrapNotifications().toArray();
    list = new java.util.ArrayList<si.matjazcerkvenik.dtools.tools.snmp.TrapNotification>();
    for (int i = (array.length) - 1; i >= 0; i--) {
        list.add(((si.matjazcerkvenik.dtools.tools.snmp.TrapNotification) (array[i])));
    }
}
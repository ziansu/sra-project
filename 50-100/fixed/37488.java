public void updateTrapNotifications() {
    if ((snmpTrapReceiverBean.getTrapReceiver()) == null) {
        return ;
    }
    java.lang.Object[] array = snmpTrapReceiverBean.getTrapReceiver().getReceivedTrapNotifications().toArray();
    for (int i = (array.length) - 1; i >= 0; i--) {
        list.add(((si.matjazcerkvenik.dtools.tools.snmp.TrapNotification) (array[i])));
    }
}
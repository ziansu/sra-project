public static java.lang.String getAddressWithoutArpaZone(java.lang.String address) {
    if (address.endsWith(mx.nic.rdap.db.model.ZoneModel.REVERSE_IP_V4)) {
        return address.substring(0, ((address.length()) - ((mx.nic.rdap.db.model.ZoneModel.REVERSE_IP_V4.length()) + 2)));
    }
    if (address.endsWith(mx.nic.rdap.db.model.ZoneModel.REVERSE_IP_V6)) {
        return address.substring(0, ((address.length()) - ((mx.nic.rdap.db.model.ZoneModel.REVERSE_IP_V6.length()) + 2)));
    }
    return address;
}
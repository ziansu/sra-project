@java.lang.Override
public com.neovisionaries.bluetooth.ble.advertising.ADStructure build(int length, int type, byte[] data) {
    java.util.UUID[] uuids;
    switch (type) {
        case 2 :
        case 3 :
        case 20 :
            uuids = extract16(data);
            break;
        case 4 :
        case 5 :
        case 31 :
            uuids = extract32(data);
            break;
        case 6 :
        case 7 :
        case 21 :
            uuids = extract128(data);
        default :
            return null;
    }
    return new com.neovisionaries.bluetooth.ble.advertising.ADUUIDs(length, type, data, uuids);
}
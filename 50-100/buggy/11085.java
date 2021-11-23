private short getCheckedValue(long address) {
    if (address >= (handlerBlock.getAddressEnd())) {
        return 13567;
    }else {
        return ((short) ((data.get(((int) (address)))) & 255));
    }
}
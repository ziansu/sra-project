public boolean CheckDupilate(java.util.List<com.smi.travel.datalayer.entity.DaytourBooking> data, com.smi.travel.datalayer.entity.DaytourBooking newdata) {
    for (int i = 0; i < (data.size()); i++) {
        com.smi.travel.datalayer.entity.DaytourBooking compare = data.get(i);
        if (compare.getId().equalsIgnoreCase(newdata.getId())) {
            java.lang.System.out.println((("id : " + (compare.getId())) + " is dup"));
            return true;
        }
    }
    return false;
}
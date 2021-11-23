@java.lang.Override
public java.lang.String getDataAsJson() {
    java.lang.String ret = "[";
    for (flyt.common.Data data : allData) {
        ret += ("[" + (i)) + ",";
        for (flyt.common.Hotel hotel : data.hotels) {
            ret += (hotel.rooms) + ",";
        }
        for (flyt.common.Network network : data.networks) {
            ret += (network.devies) + ",";
        }
        ret += "]";
    }
    ret += "]";
    return ret;
}
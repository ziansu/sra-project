public ojovoz.agroecoresearch.oLog getLogItemFromId(int id) {
    ojovoz.agroecoresearch.oLog ret = null;
    java.util.Iterator<ojovoz.agroecoresearch.oLog> iterator = log.iterator();
    while (iterator.hasNext()) {
        ojovoz.agroecoresearch.oLog l = iterator.next();
        if ((l.logId) == id) {
            ret = l;
        }
    } 
    return ret;
}
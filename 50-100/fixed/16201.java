public static boolean hasBusCodeBeenCalledJson(java.lang.String busCode) {
    if ((clearfaun.com.pokebuspro.BusInfo.addedBusCode.size()) > 0) {
        for (int i = 0; i < (clearfaun.com.pokebuspro.BusInfo.addedBusCode.size()); i++) {
            if (clearfaun.com.pokebuspro.BusInfo.addedBusCode.get(i).equals(busCode)) {
                return true;
            }
        }
    }
    return false;
}
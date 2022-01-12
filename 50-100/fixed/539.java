private int getParkingPercent(com.kingwaytek.tygo.model.items.ItemsParkingLot parkingLotItem) {
    if (((!(com.kingwaytek.tygo.utility.Utility.isNumeric(parkingLotItem.SURPLUS_SPACE))) || ((parkingLotItem.TOTAL_SPACE) <= 0)) || ((parkingLotItem.TOTAL_SPACE) < (java.lang.Integer.parseInt(parkingLotItem.SURPLUS_SPACE))))
        return com.kingwaytek.tygo.ui.fragment.parking.UiParkingLotMapFragment.PARKING_UNKNOWN_INFO;
    
    double surplus = java.lang.Double.parseDouble(parkingLotItem.SURPLUS_SPACE);
    double total = ((double) (parkingLotItem.TOTAL_SPACE));
    return ((int) ((1 - (surplus / total)) * 100));
}
private java.lang.String GetBoughtTicketsSeries(final java.util.ArrayList<Util.TravelData_INPUT.BoughtTicket> aBoughtTickets) {
    if (aBoughtTickets == null)
        return "";
    
    java.lang.String lSeries = "";
    for (Util.TravelData_INPUT.BoughtTicket lTicket : aBoughtTickets) {
        Util.HighChartDataResultComposer lHCDRCExtra = new Util.HighChartDataResultComposer();
        lHCDRCExtra.add(lTicket.mDatetime, lTicket.mPrice, "%");
        lSeries += ",\n" + (mSeriesTemplate.replace("[SERIES.NAME]", lTicket.mName).replace("[TYPE.NAME]", "line").replace("[SERIES.DATA]", lHCDRCExtra.getResult()));
    }
    return lSeries;
}
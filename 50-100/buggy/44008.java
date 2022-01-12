public java.util.List<webservice.TrainTicketRealTimeData> filterBySlot(java.lang.String slotname) {
    switch (slotname) {
        case "user_traintype" :
            return filteredTrainType();
        case "user_starttime" :
            return filterByStarttime();
        case "user_arrivetime" :
            return filterByArriveTime();
        case "user_seattype" :
            return filteredBySeattype();
        case "user_trainname" :
            if ((schemaConifg.getTrainname().getOffset()) == 0) {
                return filteredByTrainname();
            }
            break;
        case "user_advicetype" :
            return filteredByAdviceType();
        default :
            java.lang.System.out.println("TICKET : No Catch!!");
            return trainTicketRealTimeDataList;
    }
    return trainTicketRealTimeDataList;
}
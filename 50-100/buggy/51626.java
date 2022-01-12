public void performDatabaseOperations(edu.n0417634.rail.Card card, edu.n0417634.rail.CardReader reader) throws java.sql.SQLException {
    _card = card;
    _reader = reader;
    switch (_reader.getReaderMode()) {
        case "STATION" :
            processCardInStationMode();
            new edu.n0417634.rail.TicketHandler(_reader.getReaderMode());
            break;
        case "CONDUCTOR" :
            processCardInConductorMode();
            new edu.n0417634.rail.TicketHandler(_reader.getReaderMode());
            break;
        default :
            closeDBConnection();
    }
}
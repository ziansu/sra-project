public model.fields.BuyableFieldInterface[] parseBoardFiles() throws model.ParserException {
    Settings.LOGGER.debug("Start parsing Board");
    model.fields.BuyableFieldInterface[] board = new model.fields.BuyableFieldInterface[40];
    parseTrainStationFile(board);
    parseServiceFile(board);
    parseStreetFile(board);
    return board;
}
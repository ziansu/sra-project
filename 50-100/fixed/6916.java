private org.embulk.input.kafka.data.Record getRecord(byte[] message) throws org.embulk.input.kafka.exception.DataTypeNotFoundException {
    org.embulk.input.kafka.data.Record record = null;
    switch (format) {
        case Csv :
            record = org.embulk.input.kafka.data.DataConverter.convert(message, ",", enclosedChar);
            break;
        case Tsv :
            record = org.embulk.input.kafka.data.DataConverter.convert(message, "\t", enclosedChar);
            break;
        case Ltsv :
            record = org.embulk.input.kafka.data.DataConverter.convertFromLtsv(message, enclosedChar);
            break;
        case Json :
            record = org.embulk.input.kafka.data.DataConverter.convertFromJson(message);
            break;
        case MessagePack :
            break;
    }
    return record;
}
private void setCorrectFloatCommand(dooyit.parser.TagParser.TAG_TYPE tagType) {
    switch (tagType) {
        case SINGLE :
            setSingleTypeFloatCommand();
            break;
        case MULTIPLE :
            setMultipleTypeFloatCommand();
            break;
        default :
            setInvalidCommand();
            break;
    }
}
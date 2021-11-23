private void setCorrectFloatCommand(dooyit.parser.TagParser.TAG_TYPE tagType) {
    switch (tagType) {
        case SINGLE :
            setSingleTypeFloatCommand();
            break;
        default :
            setInvalidCommand();
            break;
    }
}
private boolean channelIsOutputChannel(java.lang.String id) {
    switch (id) {
        case CHANNEL_GENERAL_DIMM :
        case CHANNEL_GENERAL_SWITCH :
        case CHANNEL_GENERAL_SHADE :
        case CHANNEL_BRIGHTNESS :
        case CHANNEL_LIGHT_SWITCH :
        case CHANNEL_SHADE :
        case CHANNEL_GENERAL_COMBINED_2_STAGE_SWITCH :
        case CHANNEL_GENERAL_COMBINED_3_STAGE_SWITCH :
        case CHANNEL_COMBINED_2_STAGE_SWITCH :
        case CHANNEL_COMBINED_3_STAGE_SWITCH :
            return true;
        default :
            return false;
    }
}
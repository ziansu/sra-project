public static void writeChannelState(int channel) {
    if (channel == (es.carlosrolindez.kbfinder.SelectBtActivity.BT_CHANNEL))
        es.carlosrolindez.kbfinder.SelectBtActivity.sendSppMessage("CHN BT\r", true);
    else
        es.carlosrolindez.kbfinder.SelectBtActivity.sendSppMessage("CHN FM\r", true);
    
}
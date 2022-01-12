public int boardRank(org.gtagency.autotetris.bot.BotState state) {
    int height;
    int flag = 0;
    int i = 0;
    for (i = state.FIELD_HEIGHT; i > 0; --i) {
        for (int j = 0; j < (state.FIELD_WIDTH); ++j) {
            if (!(state.isEmpty())) {
                height = i;
                flag = 1;
                break;
            }
        }
        if (flag) {
            break;
        }
    }
    return (state.FIELD_HEIGHT) - i;
}
protected com.ocwvar.darkpurple.Services.AudioCore.AudioStatus getCurrectStatus() {
    if ((playingChannel) != 0) {
        switch (com.un4seen.bass.BASS.BASS_ChannelIsActive(playingChannel)) {
            case com.un4seen.bass.BASS.BASS_ACTIVE_PLAYING :
                return com.ocwvar.darkpurple.Services.AudioCore.AudioStatus.Playing;
            case com.un4seen.bass.BASS.BASS_ACTIVE_PAUSED :
            case com.un4seen.bass.BASS.BASS_ACTIVE_STOPPED :
                return com.ocwvar.darkpurple.Services.AudioCore.AudioStatus.Paused;
            default :
                return com.ocwvar.darkpurple.Services.AudioCore.AudioStatus.Error;
        }
    }else {
        return com.ocwvar.darkpurple.Services.AudioCore.AudioStatus.Empty;
    }
}
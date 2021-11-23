public static void updateQueue() {
    while ((theweekend.cosmetics.ipod.Radio.queuedSongs.size()) < 5) {
        int size = Noteblock.iPodSongs.size();
        if (size > 0) {
            resources.noteblock.Song generate = Noteblock.iPodSongs.get(resources.NumberUtils.randomNumber(size));
            if (!(theweekend.cosmetics.ipod.Radio.queuedSongs.contains(generate)));
            {
                theweekend.cosmetics.ipod.Radio.queuedSongs.add(generate);
            }
        }
    } 
    theweekend.cosmetics.ipod.Radio.songPosition = 0;
    theweekend.cosmetics.ipod.Radio.playRadioSong();
}
@java.lang.Override
public int compareTo(sample.Controller.FileMeta o) {
    switch (comparison) {
        case AUTHOR_NAME :
            return artist().compareTo(o.artist());
        case SONG_NAME :
            return title().compareTo(o.title());
        case SONG_LENGTH :
            return (player.length()) - (o.player.length());
        case MOD_TIME :
        default :
            return modTime.compareTo(o.modTime);
    }
}
public static at.sw2017.awesomeinc.awesomeplayer.Song nextSongInformation() {
    if ((at.sw2017.awesomeinc.awesomeplayer.Database.currentIndex) != (at.sw2017.awesomeinc.awesomeplayer.Database.all_songs.size())) {
        if (((at.sw2017.awesomeinc.awesomeplayer.Database.currentIndex) + 1) >= (at.sw2017.awesomeinc.awesomeplayer.Database.visible_songs.size()))
            return at.sw2017.awesomeinc.awesomeplayer.Database.visible_songs.get(0);
        else
            return at.sw2017.awesomeinc.awesomeplayer.Database.visible_songs.get(((at.sw2017.awesomeinc.awesomeplayer.Database.currentIndex) + 1));
        
    }
    return null;
}
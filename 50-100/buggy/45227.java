public static at.sw2017.awesomeinc.awesomeplayer.Song nextSongInformation() {
    (at.sw2017.awesomeinc.awesomeplayer.Database.currentIndex)++;
    if ((at.sw2017.awesomeinc.awesomeplayer.Database.currentIndex) != (at.sw2017.awesomeinc.awesomeplayer.Database.all_songs.size())) {
        if ((at.sw2017.awesomeinc.awesomeplayer.Database.currentIndex) >= (at.sw2017.awesomeinc.awesomeplayer.Database.visible_songs.size()))
            at.sw2017.awesomeinc.awesomeplayer.Database.currentIndex = 0;
        
        at.sw2017.awesomeinc.awesomeplayer.Song s = at.sw2017.awesomeinc.awesomeplayer.Database.visible_songs.get(at.sw2017.awesomeinc.awesomeplayer.Database.currentIndex);
        if ((at.sw2017.awesomeinc.awesomeplayer.Database.currentIndex) > 0) {
            (at.sw2017.awesomeinc.awesomeplayer.Database.currentIndex)--;
        }
        return s;
    }
    (at.sw2017.awesomeinc.awesomeplayer.Database.currentIndex)--;
    return null;
}
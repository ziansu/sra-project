public int getCount() {
    java.util.List<fr.kayrnt.tindplayer.model.Profile> profiles = tinderAPI.profiles;
    int count = 0;
    for (fr.kayrnt.tindplayer.model.Profile profile : profiles) {
        if (profile.shouldLike)
            count++;
        
    }
    return count;
}
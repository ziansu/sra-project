public int getCount() {
    synchronized(tinderAPI.profiles) {
        int count = 0;
        for (fr.kayrnt.tindplayer.model.Profile profile : tinderAPI.profiles) {
            if (profile.shouldLike)
                count++;
            
        }
        return count;
    }
}
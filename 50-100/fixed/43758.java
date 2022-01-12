public void setHero(java.lang.String heroName) {
    if (mSimilarityList.get(mPosInHeroList).hero.name.equals(heroName))
        return ;
    
    int newPos = 0;
    for (com.carver.paul.dotavision.ImageRecognition.HeroAndSimilarity hero : mSimilarityList) {
        if (hero.hero.name.equals(heroName)) {
            mLayoutManager.scrollToPositionWithOffset(newPos, 0);
            return ;
        }
        newPos++;
    }
    android.util.Log.e(TAG, (("Attempting to scroll to " + heroName) + " but can't find a hero with that name"));
}
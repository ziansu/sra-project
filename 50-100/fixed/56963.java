public void sendUpdatedHeroList() {
    java.util.List<com.carver.paul.dotavision.Models.HeroInfo> heroInfoList = new java.util.ArrayList<>();
    for (com.carver.paul.dotavision.Ui.HeroesDetected.HeroesDetectedItem.HeroDetectedItemPresenter hero : mHeroDetectedItemPresenters) {
        com.carver.paul.dotavision.Models.HeroInfo heroInfo = com.carver.paul.dotavision.Ui.HeroesDetected.HeroesDetectedPresenter.findHeroWithName(hero.getName(), mDataManger.getHeroInfo());
        heroInfoList.add(heroInfo);
    }
    mDataManger.sendUpdatedHeroList(heroInfoList);
}
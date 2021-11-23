@java.lang.Override
public void setTabs(pl.patrykzygo.pocketleague.pojo.ChampionDto champion) {
    pl.patrykzygo.pocketleague.ui.adapters.ViewPagerAdapter adapter = new pl.patrykzygo.pocketleague.ui.adapters.ViewPagerAdapter(getSupportFragmentManager());
    pl.patrykzygo.pocketleague.ui.fragments.base_fragments.BaseChampionFragment overViewTab = new pl.patrykzygo.pocketleague.ui.fragments.tabs_fragments.overview_tab.ChampionOverviewTab();
    pl.patrykzygo.pocketleague.ui.fragments.base_fragments.BaseChampionFragment abilitiesTab = new pl.patrykzygo.pocketleague.ui.fragments.tabs_fragments.abilities_tab.ChampionAbilitiesTab();
    pl.patrykzygo.pocketleague.ui.fragments.base_fragments.BaseChampionFragment loreTab = new pl.patrykzygo.pocketleague.ui.fragments.tabs_fragments.lore_tab.ChampionLoreTab();
    overViewTab.setChampion(champion);
    abilitiesTab.setChampion(champion);
    loreTab.setChampion(champion);
    adapter.addFragment(overViewTab, "Overview");
    adapter.addFragment(abilitiesTab, "Lore");
    adapter.addFragment(loreTab, "Abilities");
    viewPager.setAdapter(adapter);
}
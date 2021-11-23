@java.lang.Override
public void removeTab(io.xdevs23.cornowser.browser.browser.modules.tabs.Tab tab) {
    switchTab(0);
    tabStorage.removeTab(tab);
    currentTab = 0;
}
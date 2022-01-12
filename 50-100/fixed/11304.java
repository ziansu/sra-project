private int getCardsCountBeforeCurrentPosition(int position) {
    int count = 0;
    if ((shouldShowAppodealAdBanner) && (((ru.aviasales.template.ui.adapter.AdAdapter.APPODEAL_BANNER_POSITION) + (shouldShowAsBanner ? 1 : 0)) < position)) {
        count++;
    }
    if ((shouldShowAsBanner) && ((ru.aviasales.template.ui.adapter.AdAdapter.AS_BANNER_POSITION) < position))
        count++;
    
    return count;
}
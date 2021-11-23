public static android.support.v4.app.Fragment createGenericPlayerFragment(de.vanita5.twittnuker.model.ParcelableCardEntity card) {
    final java.lang.String playerUrl = card.getString("player_url");
    if (playerUrl == null)
        return null;
    
    return de.vanita5.twittnuker.fragment.support.card.CardBrowserFragment.show(playerUrl);
}
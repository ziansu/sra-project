public void onClick(android.view.View v) {
    net.mabako.steamgifts.data.Giveaway giveaway = ((net.mabako.steamgifts.data.Giveaway) (adapter.getItem(getAdapterPosition())));
    ((net.mabako.steamgifts.fragments.interfaces.IHasEnterableGiveaways) (fragment)).requestEnterLeave(giveaway.getGiveawayId(), (giveaway.isEntered() ? net.mabako.steamgifts.fragments.GiveawayDetailFragment.ENTRY_DELETE : net.mabako.steamgifts.fragments.GiveawayDetailFragment.ENTRY_INSERT), adapter.getXsrfToken());
}
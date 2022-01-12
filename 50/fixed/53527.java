@java.lang.Override
public int getItemViewType(int position) {
    return (list_card.get(position)) == null ? appteam.nith.hillffair.adapters.CardAdapter.FOOTER_VIEW : appteam.nith.hillffair.adapters.CardAdapter.NORMAL_VIEW;
}
@java.lang.Override
public android.view.View onCreateView(android.view.LayoutInflater inflater, android.view.ViewGroup container, android.os.Bundle savedInstanceState) {
    flipView = new com.plusonesoftwares.plusonesoftwares.bignews.FlipViewController(getContext(), com.plusonesoftwares.plusonesoftwares.bignews.FlipViewController.VERTICAL);
    utils = new com.plusonesoftwares.plusonesoftwares.bignews.Utils();
    flipView.setAdapter(new com.plusonesoftwares.plusonesoftwares.bignews.TravelAdapter(getContext(), getActivity(), utils.getFollowedCategoriesLink(getContext(), false, false)));
    return flipView;
}
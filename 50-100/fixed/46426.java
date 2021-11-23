private void showFeatsPicker() {
    net.mindsoup.charactersoup.util.CharacterSoupUtils.showListDialog(PICK_FEAT, this.getActivity(), "pf_data/feats.json", this.getActivity().getString(R.string.select_feat), new net.mindsoup.charactersoup.fragments.PickFromListFragment.ParcelablePickFromListListener() {
        @java.lang.Override
        public void onPicked(net.mindsoup.charactersoup.util.ListElement element) {
            ((net.mindsoup.charactersoup.CharacterActivity) (getActivity())).addFeat(net.mindsoup.charactersoup.pf.feats.PfFeats.getFeat(element.getIndex()));
        }

        @java.lang.Override
        public int describeContents() {
            return 0;
        }

        @java.lang.Override
        public void writeToParcel(android.os.Parcel parcel, int i) {
        }
    }, false);
}
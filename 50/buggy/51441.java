public void showEntries(@android.support.annotation.NonNull
java.util.List<com.demo.navigator.ds.model.Entry> entries) {
    mBinding.entryContentRv.setAdapter(new com.demo.navigator.navigation.EntryFragment.EntryListAdapter(entries));
}
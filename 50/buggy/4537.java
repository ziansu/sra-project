@java.lang.Override
public void onItemClick(int position) {
    mAdapterNavigationCallback.onItemClick(position);
    com.pentapus.pentapusdmh.Fragments.EncounterPrep.ImageGridAdapter.selectedUri = android.net.Uri.parse(imageUris[position].toString());
}
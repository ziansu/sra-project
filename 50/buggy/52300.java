@java.lang.Override
public void onClick(android.view.View v) {
    android.util.Log.d("CLICK", "ALBUMART");
    android.content.Intent selectorImageIntent = new android.content.Intent(android.content.Intent.ACTION_PICK);
    selectorImageIntent.setType("image/*");
    getActivity().startActivityForResult(selectorImageIntent, mx.dev.franco.musicallibraryorganizer.DetailsTrackDialog.INTENT_OPEN_GALLERY);
}
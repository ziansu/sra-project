@java.lang.Override
public void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    robobinding.sample.store.AlbumStore albumStore = new robobinding.sample.store.AlbumStore();
    long albumId = getIntent().getLongExtra(robobinding.sample.CreateEditAlbumActivity.ALBUM_ID, (-1));
    robobinding.binding.ActivityBinder binder = new robobinding.binding.ActivityBinder(this, R.layout.create_edit_album_activity, true);
    robobinding.sample.presentationmodel.CreateEditAlbumPresentationModel createEditAlbumPresentationModel = new robobinding.sample.presentationmodel.CreateEditAlbumPresentationModel(this, albumStore, albumId);
    binder.bindTo(createEditAlbumPresentationModel);
}
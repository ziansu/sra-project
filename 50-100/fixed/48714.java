@java.lang.Override
public void onStart() {
    super.onStart();
    galleryKind = ((com.cyq.mvshow.mode.GalleryKind) (getArguments().getSerializable(com.cyq.mvshow.fragment.CLASSIFY)));
    if ((galleryKind) != null) {
        loadData(MyConstants.PAGE_SIZE, galleryKind.getId(), 1);
    }
}
@java.lang.Override
public void onItemClick(android.widget.AdapterView<?> parent, android.view.View view, int position, long id) {
    com.example.krist.geosnap.Models.ImgData data = ((com.example.krist.geosnap.Models.ImgData) (parent.getAdapter().getItem(position)));
    if ((!(data.getSeenStatus())) && (data.getLoadedStatus())) {
        displayImgFullscreen(data.getImgId());
        notifyImageDisplayed(data.getImgId());
    }
}
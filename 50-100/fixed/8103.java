@java.lang.Override
public void onClick(android.view.View v) {
    com.wewow.utils.ShareUtils su = new com.wewow.utils.ShareUtils(this);
    su.setContent(subject.getTitle());
    su.setUrl(subject.getShare_link());
    if ((shareBitmap) != null) {
    }
    su.share();
}
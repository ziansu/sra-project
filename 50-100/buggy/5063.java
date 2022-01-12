@java.lang.Override
public void run() {
    if (((musics) != null) && ((musics.size()) > (current))) {
        hadLoadMusics = true;
        if ((mainCallBack) != null) {
            mainCallBack.setMusics(musics);
        }
    }
    changeMusic();
    popNotification(musics.get(current));
}
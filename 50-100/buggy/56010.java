@java.lang.Override
public int compareTo(dk.catnip.android.android_app.model.Entry another) {
    if ((score) > (another.getScore())) {
        return -1;
    }else
        if ((another.getScore()) > (score)) {
            return 1;
        }else {
            return 0;
        }
    
}
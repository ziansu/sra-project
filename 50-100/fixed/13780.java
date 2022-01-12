@java.lang.Override
public void run() {
    java.util.Iterator it = Crawler.Vis_URL.entrySet().iterator();
    while (it.hasNext()) {
        java.util.Map.Entry pair = ((java.util.Map.Entry) (it.next()));
        if (((int) (pair.getValue())) == 0) {
            processPage(pair.getKey().toString(), 1);
            break;
        }
    } 
}
@java.lang.Override
public void nextTuple() {
    if ((x) < (files.length)) {
        if (files[x].exists()) {
            TranslateFramework.Mat img = opencv_highgui.imread(((path) + (files[x].getName())));
            collector.emit(new backtype.storm.tuple.Values(new TranslateFramework.Serializable.Mat(img), files[x].getName(), 0, 0, 0, 0, 0));
        }
        (x)++;
    }
}
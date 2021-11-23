public void finished() {
    try {
        if ((bdvXML_) != null) {
            bdvXML_.close();
        }
    } catch (java.io.IOException ex) {
        misc.Log.log("Couldn't close BDV XML");
    }
    fullResStorage_.finished();
    for (acq.TaggedImageStorageMultipageTiff s : lowResStorages_.values()) {
        if (s != null) {
            s.finished();
        }
    }
    finished_ = true;
}
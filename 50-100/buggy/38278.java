@java.lang.SuppressWarnings(value = "unchecked")
@java.lang.Override
public bdv.spimdata.SpimDataMinimal load() {
    bdv.spimdata.SpimDataMinimal spimData = null;
    try {
        spimData = new bdv.spimdata.XmlIoSpimDataMinimal().load(xmlPath);
        if (bdv.spimdata.WrapBasicImgLoader.wrapImgLoaderIfNecessary(spimData)) {
            java.lang.System.err.println("WARNING:\nOpening <SpimData> dataset that is not suited for interactive browsing.\nConsider resaving as HDF5 for better performance.");
        }
    } catch (final mpicbg.spim.data.SpimDataException e) {
        e.printStackTrace();
    }
    return spimData;
}
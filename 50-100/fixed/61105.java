@java.lang.Override
public void run() {
    switch (k) {
        case info.nanodesu.reader.patches.PaClientAccessor.PID_KEY :
            pidInput.setText((v + ""));
            break;
        case info.nanodesu.reader.patches.PaClientAccessor.VERSION_KEY :
            versionInput.setSelectedItem(v);
            break;
        case info.nanodesu.webservice.MemoryApiWebservice.AUTODISCOVER :
            autoCheck.setSelected(((boolean) (v)));
            break;
    }
}
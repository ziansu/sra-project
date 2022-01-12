@java.lang.Override
public void invalidated() {
    if ((get()) != null) {
        if (!(get().equals(currentSkinClassName))) {
            loadSkinClass();
        }
    }
}
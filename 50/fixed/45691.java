@java.lang.Override
public void removeCurrentDocument() {
    if (tabs.contains(currentDocument)) {
        tabs.remove(currentDocument);
        setChanged();
        notifyObservers();
    }
}
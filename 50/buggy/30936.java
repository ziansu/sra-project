@java.lang.Override
public void removeLabel(java.lang.String qName) {
    if (qName != null) {
        labels.remove(labels.get(qName));
        labels.remove(qName);
    }
}
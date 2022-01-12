public java.util.ArrayList<com.example.wduello.collectionmanager.Attribute> getAttributesArrayList() {
    java.util.ArrayList<com.example.wduello.collectionmanager.Attribute> attributes = new java.util.ArrayList<>();
    if ((mAttributes) != null) {
        attributes = new java.util.ArrayList(mAttributes.values());
    }
    return attributes;
}
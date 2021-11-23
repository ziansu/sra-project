private void insertAll(wyil.lang.CodeBlock.Index index, wyil.lang.Attribute... attributes) {
    wyil.lang.CodeBlock.Index idx = index.prepend(ID);
    for (wyil.lang.Attribute.Map<wyil.lang.Attribute> map : this.attributes.values()) {
        map.insert(idx, null);
    }
    putAll(idx, attributes);
}
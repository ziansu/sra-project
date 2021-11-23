public void setTextview() {
    ht = hashTable.TestHashTable();
    for (java.lang.Object value : ht.values()) {
        vl = value.toString();
        JapaneseChar.setText(value.toString());
    }
}
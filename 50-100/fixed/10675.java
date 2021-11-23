public boolean contains(long value) {
    int hashCode = hash(value);
    int hashMarker = -1;
    while (((this.table[hashCode]) != null) && (hashCode != hashMarker)) {
        if ((this.table[hashCode]) == value)
            return true;
        
        if (hashMarker == (-1))
            hashMarker = hashCode;
        
        hashCode = (hashCode + 1) % (this.table.length);
    } 
    return false;
}
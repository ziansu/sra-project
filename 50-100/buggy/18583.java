private void computeDimensionHashTable() {
    for (int i = 0; i < (m_numOfdimenstions); i++) {
        for (int j = 0; j < (m_numOfHashFunc); j++) {
            m_dimentionHashTable[i][j] = this.m_arrayHashFunctions[j].doHash(i);
        }
    }
}
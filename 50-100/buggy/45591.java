public static void run5d() {
    hashing.TestKlasse.divMethod = new hashing.DivisionMethod(13);
    hashing.TestKlasse.hChainTable = new hashing.HashTableChaining(hashing.TestKlasse.divMethod);
    hashing.TestKlasse.hChainTable.insert(hashing.TestKlasse.wBantel);
    hashing.TestKlasse.hChainTable.insert(hashing.TestKlasse.rDietrich);
    hashing.TestKlasse.hChainTable.insert(hashing.TestKlasse.rHellmann);
    hashing.TestKlasse.hChainTable.insert(hashing.TestKlasse.cKarg);
    hashing.TestKlasse.hChainTable.insert(hashing.TestKlasse.uKlauck);
    hashing.TestKlasse.hChainTable.insert(hashing.TestKlasse.dKuepper);
    hashing.TestKlasse.hChainTable.insert(hashing.TestKlasse.mRoessle);
    hashing.TestKlasse.hChainTable.print();
}
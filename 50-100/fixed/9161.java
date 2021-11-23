public int hash(String key) {
    int hash = 0;
    switch (hashFunction) {
        case 0 :
            hash = additiveHash(key);
            break;
        case 1 :
            hash = rotationalHash(key);
            break;
        default :
            java.lang.System.out.println("Error when setting hash function - given hash function not found.");
            java.lang.System.exit(0);
    }
    return hash;
}
public int hash(V value) {
    int hash = 0;
    switch (hashFunction) {
        case "additiveHash" :
            hash = additiveHash(value);
            break;
        case "rotationalHash" :
            hash = rotationalHash(value);
            break;
        default :
            java.lang.System.out.println("Error when setting hash function - given hash function not found.");
            java.lang.System.exit(0);
    }
    return hash;
}
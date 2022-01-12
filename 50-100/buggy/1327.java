public byte[] queryTypeSetter(java.lang.String queryType) {
    switch (queryType) {
        case "MX" :
            return new byte[]{ 0 , 0 , 0 , 15 };
        case "NS" :
            return new byte[]{ 0 , 0 , 0 , 2 };
        default :
            return new byte[]{ 0 , 0 , 0 , 1 };
    }
}
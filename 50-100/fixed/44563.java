public void removeFromBucket(java.lang.String rid) {
    for (int i = 0; i < (contents.length); i++) {
        if (((contents[i]) != null) && ((contents[i].rid) == rid)) {
            contents[i] = null;
            return ;
        }
    }
}
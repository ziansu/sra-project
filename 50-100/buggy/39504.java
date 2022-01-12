public int compareTo(ldbc.snb.datagen.objects.Knows k) {
    int res = ((int) ((to_.accountId()) - (k.to().accountId())));
    if (res != 0)
        return res;
    
    long res2 = (creationDate_) - (k.creationDate());
    if (res2 > 0)
        return 1;
    
    if (res2 < 0)
        return -1;
    
    return 0;
}
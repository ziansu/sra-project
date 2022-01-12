public int compareTo(ldbc.snb.datagen.objects.Knows k) {
    long res = (to_.accountId()) - (k.to().accountId());
    if (res > 0)
        return 1;
    
    if (res < 0)
        return -1;
    
    return 0;
}
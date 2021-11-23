private static int hashFunction(java.lang.String value, int start, int end) {
    int hash = 0;
    for (int i = start; i < end; i++) {
        hash = ((hash * (week7.strings.needlehaystack.NeedleHaystack.BASE)) + (((value.charAt(i)) - 'a') + 1)) % (week7.strings.needlehaystack.NeedleHaystack.MOD);
    }
    return hash;
}
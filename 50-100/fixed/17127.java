private static int memchr(char[] haystack, int offset, char needle, int num) {
    if (num != 0) {
        int p = 0;
        do {
            if ((haystack[(offset + p)]) == needle)
                return 1;
            
            p++;
        } while ((--num) != 0 );
    }
    return 0;
}
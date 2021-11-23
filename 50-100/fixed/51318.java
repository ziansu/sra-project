public static void FindMaxMinByte() {
    byte minByte = 0;
    byte maxByte = 0;
    byte i = java.lang.Byte.MIN_VALUE;
    while (i != (java.lang.Byte.MAX_VALUE)) {
        if (minByte > i)
            minByte = i;
        else {
            i++;
            maxByte = i;
        }
    } 
    java.lang.System.out.println(((("Min byte: " + minByte) + " | Max byte: ") + maxByte));
}
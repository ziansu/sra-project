public static char[] cross(creatures.CharCreature creat1, creatures.CharCreature creat2) {
    char[] output = new char[creat1.chrom.length];
    for (int i = 0; i < (output.length); i++) {
        if (i < ((output.length) / 2)) {
            output[i] = creat1.chrom[i];
        }else {
            output[i] = creat2.chrom[i];
        }
    }
    return output;
}
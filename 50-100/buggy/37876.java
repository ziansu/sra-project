public double getKConstant(java.lang.String line) {
    int kIndex = (line.indexOf("->")) + 2;
    int endKIndex = line.substring(kIndex).indexOf(' ');
    if (kIndex != 1)
        return java.lang.Double.parseDouble(line.substring(kIndex, endKIndex));
    
    return 0;
}
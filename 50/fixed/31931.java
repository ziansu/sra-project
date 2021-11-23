public void printByte(byte b) {
    java.lang.String s1 = java.lang.String.format("%4s", java.lang.Integer.toBinaryString((b & 255))).replace(' ', '0');
    java.lang.System.out.print(s1);
}
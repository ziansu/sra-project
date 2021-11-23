public static void main(java.lang.String[] args) throws java.lang.Exception {
    java.lang.String filename = args[0];
    java.lang.String encoding = args[1];
    java.lang.String format = args[2];
    int shift = java.lang.Integer.parseInt(args[3]);
    cz.kamma.subtitle.shifter.ShifterEngine a = new cz.kamma.subtitle.shifter.ShifterEngine();
    a.openFile(filename);
    a.readFile(encoding, format);
    a.applyShiftMillis(shift, 0, true);
    a.writeFile((filename + ".new"), encoding, format);
}
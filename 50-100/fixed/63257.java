public static void main(java.lang.String[] args) {
    edu.m0r.crypto.Main.askMessage();
    edu.m0r.crypto.Main.chooseMode();
    edu.m0r.crypto.Main.getCypher().encrypt();
    edu.m0r.crypto.Main.getInput().readString();
    edu.m0r.crypto.Main.getCypher().decrypt();
}
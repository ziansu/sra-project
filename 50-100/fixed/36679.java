public java.lang.String changeToHex(int intBase10) {
    java.lang.String answer = "";
    if ((intBase10 < 0) || (intBase10 > 255)) {
        javax.swing.JOptionPane.showMessageDialog(null, "Error, range outside of 0-255, please try again");
        return null;
    }else {
        answer = java.lang.Integer.toHexString(intBase10);
    }
    return answer;
}
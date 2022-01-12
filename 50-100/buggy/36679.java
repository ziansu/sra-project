public java.lang.String changeToHex(int intBase10) {
    java.lang.String answer = "";
    if ((intBase10 < 0) || (intBase10 > 255)) {
        javax.swing.JOptionPane.showMessageDialog(null, "Error, range outside of 0-255, please try again");
        return null;
    }else
        if ((intBase10 >= 0) && (intBase10 <= 255)) {
            answer = java.lang.Integer.toHexString(intBase10);
        }
    
    if (intBase10 == 0)
        answer = "00";
    
    if (intBase10 == 255)
        answer = "FF";
    
    return answer;
}
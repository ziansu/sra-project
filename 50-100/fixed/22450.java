private java.lang.String choose2String(int choose) {
    switch (choose) {
        case 0 :
            return this.staticLanguage.scissorsString;
        case 1 :
            return this.staticLanguage.stoneString;
        case 2 :
            return this.staticLanguage.stoneString;
        default :
            javax.swing.JOptionPane.showMessageDialog(null, "throw!", "ERROR", javax.swing.JOptionPane.ERROR_MESSAGE);
            throw new java.lang.RuntimeException();
    }
}
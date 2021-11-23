public void chooseText() {
    java.lang.String text = javax.swing.JOptionPane.showInputDialog("Please enter your text: ");
    if (text == null)
        this.text = "";
    else
        this.text = text;
    
    java.lang.System.out.println(text);
}
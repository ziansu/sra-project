public java.lang.Integer getValue() {
    if (this.getText().isEmpty())
        return null;
    
    return java.lang.Integer.parseInt(this.getText());
}
public void computeOperation() {
    if (!(mainText.getText().equals(""))) {
        memory = java.lang.Double.parseDouble(mainText.getText());
        arg1 = java.lang.Double.parseDouble(mainText.getText());
        mainText.setText("");
    }else {
        arg1 = memory;
        mainText.setText("");
        java.lang.System.out.println(memory);
    }
}
public void computeOperation() {
    if (!(mainText.getText().equals(""))) {
        memory = java.lang.Double.parseDouble(mainText.getText());
        arg1 = java.lang.Double.parseDouble(mainText.getText());
        java.lang.System.out.println("hello");
        java.lang.System.out.println(memory);
        java.lang.System.out.println(arg1);
        mainText.setText("");
    }else {
        arg1 = memory;
        mainText.setText("");
        java.lang.System.out.println(memory);
    }
}
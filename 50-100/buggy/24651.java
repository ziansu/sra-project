@java.lang.Override
public void actionPerformed(java.awt.event.ActionEvent e) {
    double in = -1;
    try {
        in = java.lang.Double.parseDouble(input.getText());
    } catch (java.lang.Exception e2) {
        result.setText("Invalid Input Bozo Brain");
    }
    if (in != 0) {
        if ((java.lang.Math.random()) < in) {
            result.setText("Yes");
        }else {
            result.setText("No");
        }
    }
}
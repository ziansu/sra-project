@java.lang.Override
public void actionPerformed(java.awt.event.ActionEvent e) {
    double in = -1;
    try {
        in = java.lang.Double.parseDouble(input.getText());
        java.lang.System.out.println(in);
    } catch (java.lang.Exception e2) {
    }
    if (in != (-1)) {
        if ((java.lang.Math.random()) < in) {
            result.setText("Yes");
        }else {
            result.setText("No");
        }
    }else {
        result.setText("Invalid Input Bozo Brain");
    }
}
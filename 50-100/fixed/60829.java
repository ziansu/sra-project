@java.lang.Override
public void actionPerformed(java.awt.event.ActionEvent ae) {
    double ans = ib_project2.Processing.calculate();
    if (ans < 0) {
        Answer.setText("Error");
    }else {
        Answer.setText((("Answer: " + ans) + ""));
    }
}
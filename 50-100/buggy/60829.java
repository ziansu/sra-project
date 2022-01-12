@java.lang.Override
public void actionPerformed(java.awt.event.ActionEvent ae) {
    if ((ib_project2.GUI.chemicalDrop2.getSelectedIndex()) == 0) {
        double ans = ib_project2.Processing.calculate();
        if (ans < 0) {
            Answer.setText("Error");
        }else {
            Answer.setText((("Answer: " + ans) + ""));
        }
    }
}
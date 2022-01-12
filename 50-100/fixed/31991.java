@java.lang.Override
public void actionPerformed(java.awt.event.ActionEvent e) {
    java.lang.String response = javax.swing.JOptionPane.showInputDialog(frame, "Please enter a file name:", null);
    input_output.Load load;
    load = new input_output.Load(response);
    biomorphHandling.Biomorph loadedBiomorph = load.load();
    bm.addSpecific(loadedBiomorph);
    gm.refreshMainPanel();
}
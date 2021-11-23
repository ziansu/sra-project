@java.lang.Override
public void actionPerformed(java.awt.event.ActionEvent e) {
    nl.detoren.ijc.ui.model.SerieModel model = ((nl.detoren.ijc.ui.model.SerieModel) (serieTabel[groepID].getModel()));
    model.wisSerie(2);
    model.forceRepaint();
}
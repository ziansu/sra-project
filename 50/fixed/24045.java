@java.lang.Override
public void actionPerformed(java.awt.event.ActionEvent e) {
    nl.detoren.ijc.ui.model.SerieModel model = ((nl.detoren.ijc.ui.model.SerieModel) (serieTabel[1].getModel()));
    model.wisSerie(1);
    model.forceRepaint();
}
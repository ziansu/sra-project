private void definirLookAndFeel() {
    javax.swing.SwingUtilities.invokeLater(() -> {
        try {
            br.univali.ps.ui.swing.weblaf.WeblafUtils.instalaWeblaf();
            br.univali.ps.ui.utils.FabricaDeFileChooser.inicializar();
        } catch (java.lang.Exception e) {
            br.univali.ps.nucleo.PortugolStudio.LOGGER.log(java.util.logging.Level.SEVERE, e.getMessage(), e);
        }
    });
}
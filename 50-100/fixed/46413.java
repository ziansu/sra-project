private java.awt.event.ActionListener configuraExitListener(final java.awt.SystemTray tray) {
    return new java.awt.event.ActionListener() {
        @java.lang.Override
        public void actionPerformed(java.awt.event.ActionEvent e) {
            br.itecbrazil.serviceftpcliente.model.ScheduleEngine.pararScheduler();
            getViewHome().dispose();
            try {
                br.itecbrazil.serviceftpcliente.util.UtilSocket.liberarPortaParaNovasIntacias();
            } catch (java.io.IOException ex) {
                javax.swing.JOptionPane.showMessageDialog(null, ("ERRO: Ocorreu um erro inesperado ao fechar o programa, verifique a porta 9581" + ""), "ALERT", javax.swing.JOptionPane.ERROR_MESSAGE);
            }
            tray.remove(iconItec);
        }
    };
}
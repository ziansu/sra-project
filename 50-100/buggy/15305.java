public void actionPerformed(java.awt.event.ActionEvent e) {
    if (0 < (selectedValuesList.size())) {
        for (java.lang.String tmp : selectedValuesList) {
            java.lang.String[] splited = tmp.split("\\s+");
            pipeLock.lock();
            try {
                writeProc.write(((servergui.ServerFrame.UPLOADPAYLOADS) + (splited[0])));
            } catch (java.lang.Exception exc) {
                java.lang.System.out.println(exc);
            } finally {
                pipeLock.unlock();
            }
        }
    }
}
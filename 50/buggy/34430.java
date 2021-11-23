public void actionPerformed(java.awt.event.ActionEvent e) {
    btn.setOpen(true);
    removeAll();
    repaint();
    setSelectedComponent(CircuitSimulator.BUTTON, btn);
    if (circuitRunning)
        circuitValidation();
    
}
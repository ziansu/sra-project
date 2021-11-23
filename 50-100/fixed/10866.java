@java.lang.Override
public void actionPerformed(java.awt.event.ActionEvent e) {
    java.lang.Object src = e.getSource();
    if (src == (begin))
        l = new Brain.TemporalLobe.Locked("LOCKED", c);
    else
        if (src == (back))
            c.changePanel("3");
        
    
}
@java.lang.Override
public void actionPerformed(java.awt.event.ActionEvent event) {
    if (event.getActionCommand().equals("OK")) {
        generateSamples();
    }else
        if (event.getActionCommand().equals("Cancel")) {
            if ((task) != null)
                task.done();
            
            this.dispose();
        }
    
}
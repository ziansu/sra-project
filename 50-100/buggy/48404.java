@java.lang.Override
public void actionPerformed(java.awt.event.ActionEvent event) {
    java.lang.Object source = event.getSource();
    if (source == (stop)) {
        isRunning = false;
        java.lang.System.out.println("Stop clicked");
    }else
        if (source == (start)) {
            java.lang.System.out.println("Start clicked");
            isRunning = true;
        }else
            if (source == (calc)) {
                java.lang.System.out.println("calc clicked");
            }else
                if (source == (clear)) {
                    java.lang.System.out.println("clear clicked");
                }
            
        
    
}
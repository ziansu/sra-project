public void mostraMissatge(java.lang.String nomView, java.lang.String text) {
    if (nomView.equals("View1"))
        presentacio.View1.mostrarMissatge(text);
    else
        if (nomView.equals("View2"))
            presentacio.View2.mostrarMissatge(text);
        else
            if (nomView.equals("View3"))
                presentacio.View3.mostrarMissatge(text);
            else
                if (nomView.equals("View4"))
                    presentacio.View4.mostrarMissatge(text);
                else
                    if (nomView.equals("View5"))
                        presentacio.View5.mostrarMissatge(text);
                    
                
            
        
    
}
public void mostraMissatge(java.lang.String nomView, java.lang.String text) {
    switch (nomView) {
        case "View1" :
            presentacio.View1.mostrarMissatge(text);
        case "View2" :
            presentacio.View2.mostrarMissatge(text);
        case "View3" :
            presentacio.View3.mostrarMissatge(text);
        case "View4" :
            presentacio.View4.mostrarMissatge(text);
        case "View5" :
            presentacio.View5.mostrarMissatge(text);
    }
}
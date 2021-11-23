public void mostraMissatge(java.lang.String nomView, java.lang.String text) {
    switch (nomView) {
        case "View1" :
            presentacio.View1.mostraMissatge(text);
        case "View2" :
            presentacio.View2.mostraMissatge(text);
        case "View3" :
            presentacio.View3.mostraMissatge(text);
        case "View4" :
            presentacio.View4.mostraMissatge(text);
        case "View5" :
            presentacio.View5.mostraMissatge(text);
    }
}
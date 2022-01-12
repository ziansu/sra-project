private static void cambiarPorPanel3(java.lang.String tipoProblema) {
    if (((main.Combinatoria.getListaPanelesCentral().size()) > 1) && (main.Combinatoria.getTipoProblema().equals("Desconocido")))
        main.Combinatoria.quitarPanelesCentralMenosPrimero();
    
    main.Combinatoria.anadirCompPanelCentral(new paneles.Panel3());
    main.Combinatoria.setTipoProblema(tipoProblema);
}
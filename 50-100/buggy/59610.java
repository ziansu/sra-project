@java.lang.Override
protected void clientResponse(java.lang.String s) {
    int i = java.lang.Integer.parseInt(s);
    switch (i) {
        case 1 :
            swapAcces(services.AccesServices.class);
            break;
        case 2 :
            break;
        case 3 :
            break;
        case 4 :
            break;
        case 5 :
            break;
        case 6 :
            break;
        case 7 :
            exit();
            break;
        default :
            out.println((("La reponse " + i) + " n'est pas une option valide."));
    }
}
@java.lang.Override
protected void clientResponse(java.lang.String response) {
    response.trim();
    int i = java.lang.Integer.parseInt(response);
    switch (i) {
        case 1 :
            swapAcces(services.AccesServices.class);
            break;
        case 2 :
            connexion();
            break;
        case 3 :
            createAccount();
            break;
        case 4 :
            exit();
            break;
        default :
            out.println((("La reponse " + i) + " n'est pas une option valide."));
    }
}
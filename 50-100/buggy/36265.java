public void choixCartes(java.lang.String card) {
    if ((!(carteTransport)) && (!(carteDestination))) {
        switch (card) {
            case "wagon" :
                carteTransport = true;
                break;
            case "boat" :
            case "bateau" :
                carteTransport = true;
                break;
            case "destination" :
                carteDestination = true;
                break;
        }
    }
    if (carteTransport) {
        (nbCartes)++;
    }
}
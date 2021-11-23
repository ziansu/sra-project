public void choixCartes(java.lang.String card) {
    if ((!(carteTransport)) && (!(carteDestination))) {
        switch (card) {
            case "wagon" :
                java.lang.System.out.println("wagon");
                carteTransport = true;
                break;
            case "boat" :
            case "bateau" :
                carteTransport = true;
                java.lang.System.out.println("bateau");
                break;
            case "destination" :
                carteDestination = true;
                java.lang.System.out.println("destination");
                break;
        }
    }
    if (carteTransport) {
        (nbCartes)++;
        java.lang.System.out.println(nbCartes);
    }
}
private java.lang.String getRandomActivity() {
    java.util.Random r = new java.util.Random();
    int i = r.nextInt(7);
    switch (i) {
        case 0 :
            return "Heb je wat tijd tussen afspraken? Maak eens een wandeling.";
        case 1 :
            return "Heb je wat tijd tussen afspraken? Strek je benen eens.";
        case 2 :
            return "Ga eens staan tijdens een college/afspraak in plaats van te zitten.";
        case 3 :
            return "Als je maar een kleine afstand moet rijden, kun je overwegen om met de fiets te gaan.";
        case 4 :
            return "Als je maar een kleine afstand moet rijden, kun je overwegen om te voet te gaan.";
        case 5 :
            return "Neem je de bus? Stap eens een halte later op, en/of eerder uit. " + "Pak je de auto? Parkeer je auto dan verder weg.";
        case 6 :
            return "Moet je op een andere verdieping zijn? Neem dan eens de trap in plaats van de lift!";
        default :
            return "Moet je op een andere verdieping zijn? Neem dan eens de trap in plaats van de lift!";
    }
}
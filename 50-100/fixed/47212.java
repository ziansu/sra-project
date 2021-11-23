public void fusionContent(Bdd.Bdd.content cont) {
    for (int i = 0; i <= (CircularCounter.imax); i++) {
        for (int w1 = 0; w1 < 4; w1++) {
            for (int w2 = 0; w2 < 4; w2++) {
                oiw1w2[i][w1][w2] += cont.oiw1w2[i][w1][w2];
            }
        }
    }
    nb_CDS += cont.nb_CDS;
    nb_CDS_non_traites += cont.nb_CDS_non_traites;
    nb_items += cont.nb_items;
}
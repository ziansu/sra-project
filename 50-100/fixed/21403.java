@java.lang.Override
public float getCost() {
    float cout = 0;
    cout += ordo.data.Constantes.coutCamion;
    cout += (ordo.data.Constantes.coutDureeCamion) * ((this.getDuree()) / 3600);
    cout += (ordo.data.Constantes.coutTrajetCamion) * ((this.getDistance()) / 1000);
    if ((type) == (ordo.algo.HypoTournee.Type.TRAIN)) {
        cout += ordo.data.Constantes.coutSecondeRemorque;
        cout += (ordo.data.Constantes.coutTrajetSecondeRemorque) * ((this.getDistance()) / 1000);
    }
    setCost(cout);
    return cout;
}
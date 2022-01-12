public void setBomberman(mapa.Bomberman bm) {
    if (bm == null) {
        bomberM = null;
    }else {
        if ((e) != null) {
            bm.morir();
        }
        if ((bm.getCelda()) != null)
            bm.getCelda().setBomberman(null);
        
        bomberM = bm;
        bomberM.setCelda(this);
    }
}
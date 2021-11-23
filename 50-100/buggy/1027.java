public void setEnemigo(mapa.Enemigo enem) {
    if (enem == null) {
        e = null;
    }else {
        if ((bomberM) != null) {
            bomberM.morir();
        }
        if (((e) != null) && ((b) == null)) {
            if ((enem.getCelda()) != null)
                enem.getCelda().setEnemigo(null);
            
            e = enem;
            enem.setCelda(this);
        }
    }
}
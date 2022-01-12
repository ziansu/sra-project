@java.lang.Override
public void mouseClicked(java.awt.event.MouseEvent arg0) {
    if (!(it.ing.unibs.fondamenti.es12416.garfica.TamaVita.control(tam, lblImmagine, lblStato))) {
        btnCarezza.setEnabled(false);
        btnBiscotto.setEnabled(false);
    }else
        tam.daiCarezza(myMath.randInt(it.ing.unibs.fondamenti.es12416.garfica.TamaVita.RANGE_MIN, it.ing.unibs.fondamenti.es12416.garfica.TamaVita.RANGE_MAX));
    
}
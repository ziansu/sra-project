@java.lang.Override
public void changed(com.badlogic.gdx.scenes.scene2d.utils.ChangeListener.ChangeEvent event, com.badlogic.gdx.scenes.scene2d.Actor actor) {
    tipoDePiezas = box3.getSelected().toString();
    if (tipoDePiezas.equals("MiniHéroe"))
        tipoDePiezas = "MiniHeroe";
    
    box3.setSelected(tipoDePiezas);
    cambioTipoPieza(tipoDePiezas);
}
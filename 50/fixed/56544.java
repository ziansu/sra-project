@java.lang.Override
public void changed(fungeons.game.ChangeEvent event, com.badlogic.gdx.scenes.scene2d.Actor actor) {
    screenControl.setName(list.getSelected().toString(), false);
    screenControl.setnScreen(4);
}
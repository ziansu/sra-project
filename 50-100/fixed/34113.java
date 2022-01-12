@java.lang.Override
public boolean equals(final java.lang.Object obj) {
    if ((obj == null) || ((obj.getClass()) != (uk.co.jamesmcguigan.rockpaperscissors.models.Player.class))) {
        return false;
    }
    uk.co.jamesmcguigan.rockpaperscissors.models.Player player = ((uk.co.jamesmcguigan.rockpaperscissors.models.Player) (obj));
    return ((player.getIsHuman()) == (getIsHuman())) && (player.getGesture().getName().equals(getGesture().getName()));
}
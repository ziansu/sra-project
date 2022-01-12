@java.lang.Override
public boolean equals(final java.lang.Object obj) {
    if ((obj == null) || ((obj.getClass()) != (uk.co.jamesmcguigan.rockpaperscissors.models.Gesture.class))) {
        return false;
    }
    uk.co.jamesmcguigan.rockpaperscissors.models.Gesture winningCombinationGesture = ((uk.co.jamesmcguigan.rockpaperscissors.models.Gesture) (obj));
    return winningGesture.getName().equals(winningCombinationGesture.getName());
}
@java.lang.Override
public boolean equals(final java.lang.Object obj) {
    if (uk.co.jamesmcguigan.rockpaperscissors.models.Gesture.class.equals(obj.getClass())) {
        uk.co.jamesmcguigan.rockpaperscissors.models.Gesture winningCombinationGesture = ((uk.co.jamesmcguigan.rockpaperscissors.models.Gesture) (obj));
        return winningGesture.getName().equals(winningCombinationGesture.getName());
    }
    return false;
}
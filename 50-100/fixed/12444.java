public static void updateForNotes(@android.support.annotation.NonNull
com.wildsmith.jarble.provider.jar.JarTableMarbleModel[] marbles, @android.support.annotation.NonNull
com.wildsmith.jarble.provider.jar.JarTableMarbleModel updatedMarble) {
    for (com.wildsmith.jarble.provider.jar.JarTableMarbleModel marble : marbles) {
        if ((marble == null) || ((marble.getId()) != (updatedMarble.getId()))) {
            continue;
        }
        marble.purposeNotes = updatedMarble.purposeNotes;
        marble.performanceNotes = updatedMarble.performanceNotes;
        break;
    }
}
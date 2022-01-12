public static void semitoneDown(com.kekstudio.musictheory.Note note) {
    (note.value)--;
    if ((note.name.charAt(((note.name.length()) - 1))) == (Music.SHARP)) {
        note.name = note.name.substring(0, ((note.name.length()) - 1));
    }else {
        note.name += Music.FLAT;
    }
}
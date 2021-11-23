public static void semitoneUp(com.kekstudio.musictheory.Note note) {
    (note.value)++;
    if ((note.name.charAt(((note.name.length()) - 1))) == (Music.FLAT)) {
        note.name = note.name.substring(0, ((note.name.length()) - 1));
    }else {
        note.name += Music.SHARP;
    }
}